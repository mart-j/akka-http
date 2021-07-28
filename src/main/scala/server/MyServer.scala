package server

import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import de.heikoseeberger.akkahttpcirce.FailFastCirceSupport


case class Person(name: String, age: Int)

case class UserAdded(id: String, timestamp: Long)

object MyServer extends FailFastCirceSupport {


  implicit val system = ActorSystem(Behaviors.empty, "my-system")

  import io.circe.generic.auto._

  val route: Route = (path("api" / "user") & post) {
    entity(as[Person]) { person =>
      complete(person)
    }
  }

  def main(args: Array[String]): Unit = {
    Http().newServerAt("localhost", 8080).bind(route)
  }


}
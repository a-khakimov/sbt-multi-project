import cats.effect.{IO, IOApp}

object HelloWorldB extends IOApp.Simple {
  val run = IO.println("Hello, World! From B project")
}

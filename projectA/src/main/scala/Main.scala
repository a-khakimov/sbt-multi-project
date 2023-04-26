import cats.effect.{IO, IOApp}

object HelloWorld extends IOApp.Simple {
  val foo = Foo("bar")
  val run = IO(println(s"Hello, World! From A project \n$foo"))
}
import scala.io.BufferedSource
import scala.io.Source
import scala.util.Using

object Main:
  lazy val msg: String =
    Using.resource(Source.fromResource("myResource.txt")):
      (b: BufferedSource) => b.mkString.trim

  @main def run(): Unit =
    println(msg)

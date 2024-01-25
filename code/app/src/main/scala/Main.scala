import scala.io.BufferedSource
import scala.io.Source
import scala.util.Using

object Main extends App:
  lazy val msg: String =
    Using.resource(Source.fromResource("myResource.txt")):
      (b: BufferedSource) => b.mkString.trim

  println(msg)

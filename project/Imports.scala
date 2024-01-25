import sbt.Keys.*

object Imports {
  lazy val common = Seq(
    scalacOptions +=
      Seq(
        "java.lang",
        "scala",
        "scala.Predef",
        "scala.annotation",
        "scala.util.chaining"
      ).mkString("-Yimports:", ",", "")
  )
}

import sbt.*

object Dependencies {
  lazy val common =
    Seq(
    )

  lazy val app =
    Seq(
    )

  lazy val test = Seq(
    "org.scalatest" %% "scalatest" % Version.scalatest % "test"
  )
}

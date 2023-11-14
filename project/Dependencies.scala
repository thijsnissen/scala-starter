import sbt.*

object Dependencies {
  lazy val app: Seq[ModuleID] = Seq(
    "org.scalatest" %% "scalatest" % Version.scalaTest % "test",
    "com.lihaoyi"   %% "pprint"    % Version.pprint
  )
}

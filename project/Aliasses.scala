import sbt.*

object Aliasses {
  lazy val common =
    addCommandAlias("format", "scalafmtAll;scalafmtSbt") ++
      addCommandAlias("validate", "format;compile;Test/compile")
}

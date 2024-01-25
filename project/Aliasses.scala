import sbt.*

object Aliasses {
  lazy val common =
    addCommandAlias("format", "scalafmtAll;scalafmtSbt") ++
      addCommandAlias("check", "scalafmtCheckAll;scalafmtSbtCheck") ++
    addCommandAlias("v", "format;compile;Test/compile") ++
      addCommandAlias("vt", "validate;test")
}

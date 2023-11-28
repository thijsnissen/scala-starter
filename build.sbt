ThisBuild / organization := "nl.thijsnissen"
ThisBuild / version      := Version.version
ThisBuild / scalaVersion := Version.scala

lazy val root =
  project
    .in(file("code"))
    .settings(name := "scala-starter")
    .settings(
      description := "Directory structure and settings for starting a new Scala project"
    )
    .settings(libraryDependencies ++= Dependencies.common)
    .settings(commonSettings ++ commonImports)
    .settings(aliases)

lazy val commonSettings = Seq(
  scalacOptions ++= Seq(
    "-encoding",
    "utf8",
    "-language:implicitConversions",
    "-language:existentials",
    "-deprecation",
    "-feature",
    "-unchecked",
    "-Werror",
    "-Wunused:imports",
    "-Wunused:locals",
    "-print-lines",
    "-explain"
  ),
  Compile / run / fork         := true,
  Compile / run / connectInput := true,
  Compile / run / javaOptions += "-Xmx4G"
)

lazy val commonImports = Seq(
  scalacOptions +=
    Seq(
      "java.lang",
      "scala",
      "scala.Predef",
      "scala.annotation",
      "scala.util.chaining"
    ).mkString("-Yimports:", ",", "")
)

lazy val aliases = {
  addCommandAlias("format", "scalafmtAll;scalafmtSbt")
}

ThisBuild / watchBeforeCommand := Watch.clearScreen

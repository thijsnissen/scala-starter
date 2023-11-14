ThisBuild / organization := "nl.thijsnissen"
ThisBuild / version      := Version.app
ThisBuild / scalaVersion := Version.scala

lazy val root =
  project
    .in(file("."))
    .settings(name := "scala-starter")
    .settings(description := "Directory structure and settings for starting a new Scala project")
    .settings(libraryDependencies ++= Dependencies.app)

ThisBuild / scalacOptions ++= Seq(
  "-encoding", "utf8",
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
)

ThisBuild / watchBeforeCommand := Watch.clearScreen
Compile / run / fork         := true
Compile / run / connectInput := true
Compile / run / javaOptions += "-Xmx4G"

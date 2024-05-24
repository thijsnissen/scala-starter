ThisBuild / organization := "nl.thijsnissen"
ThisBuild / version      := Version.version
ThisBuild / scalaVersion := Version.scala

lazy val root =
  project
    .in(file("."))
    .settings(
      name           := "Scala Starter",
      normalizedName := "scala-starter",
      description := "Directory structure and settings for starting a new Scala project"
    )
    .settings(Aliasses.common)
    .aggregate(app)

lazy val app =
  project
    .in(file("code/app"))
    .settings(Settings.common ++ Settings.imports)
    .settings(
      libraryDependencies ++=
        Dependencies.common ++ Dependencies.app ++ Dependencies.test
    )
    .enablePlugins(JibPlugin)

ThisBuild / watchBeforeCommand := Watch.clearScreen

Global / onChangedBuildSource := ReloadOnSourceChanges

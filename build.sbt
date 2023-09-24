ThisBuild / name         := "scala-starter"
ThisBuild / version      := "0.1.0"
ThisBuild / scalaVersion := "3.3.1"

lazy val root =
	project
		.in(file("."))

ThisBuild / libraryDependencies ++= Seq(
	"org.scalatest" %% "scalatest" % "3.2.16" % "test",
	"com.lihaoyi"   %% "pprint"    % "0.8.1"
)

ThisBuild / scalacOptions ++= Seq(
	"-encoding", "utf8",
	"-language:implicitConversions",
	"-language:existentials",
	"-deprecation",
	"-feature",
	"-unchecked",
	"-Werror",
)

ThisBuild / watchBeforeCommand := Watch.clearScreen

ThisBuild / shellPrompt := {
	(state: State) =>
		s"sbt:${(ThisBuild / name).value}:" +
			s"${Project.extract(state).currentProject.id}" +
			s"${scala.Console.CYAN}>${scala.Console.RESET}"
}

Compile / run / fork := true
Compile / run / connectInput := true
Compile / run / javaOptions += "-Xmx4G"

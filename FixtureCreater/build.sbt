import AssemblyKeys._

name := "FixtureCreater"

organization := "jp.co.applicative.tool"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.13" % "test",
  "org.yaml" % "snakeyaml" % "1.12",
  "org.apache.poi" % "poi" % "3.9"
)

initialCommands := "import jp.co.applicative.tool.FixtureCreater._"

assemblySettings
name := """Godparent"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "mysql" % "mysql-connector-java" % "5.1.24",
  "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
)
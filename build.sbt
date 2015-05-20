name := "play-java"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

lazy val `plain-sbt-project` = project

scalaVersion := "2.10.5"

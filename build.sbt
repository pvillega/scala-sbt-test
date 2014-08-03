import sbt.Keys._
import sbt._

name := "scala-sbt-test"

version := "1.0"

scalaVersion := "2.11.2"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.1" % "test"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.0.9"

libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.0.0"

libraryDependencies += "org.scalactic" % "scalactic_2.11" % "2.2.1"

org.scalastyle.sbt.ScalastylePlugin.Settings

unidocSettings

site.settings

site.includeScaladoc()

ghpages.settings

git.remoteRepo := "git@github.com:pvillega/scala-sbt-test.git"

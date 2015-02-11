import com.typesafe.sbt.packager.universal.UniversalKeys
import play._
import sbt._
import Keys._

object CatilloBuild extends Build with UniversalKeys {

  /**
   * Define the root
   */
  lazy val root =
    project.in(file("."))
    .settings(commonSettinga:_*)
    .enablePlugins(PlayScala)

  lazy val commonSettings = Seq(
    organization := "de.woq",
    version := "1.0-SNAPSHOT",
    name := "castillo",
    scalaVersion := "2.11.4"
  )
}
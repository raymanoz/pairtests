import sbt.Keys._

name := "library"

organization := "com.barclays"

scalaVersion := "2.11.6"

libraryDependencies ++= {
  Seq(
    "org.scalatest"                 %% "scalatest"                % "2.2.4"                 % "test"
  )
}

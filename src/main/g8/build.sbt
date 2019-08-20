import sbt._

name := "$name;format="lower,hyphen"$"

version := "0.1"

scalaVersion := "2.13.0"

//resolvers += Resolver.sonatypeRepo("releases")
//resolvers += Resolver.sonatypeRepo("snapshots")


libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.8" % "test"
)

import sbt._

name := "$name;format="lower,hyphen"$"

version := "0.1"

scalaVersion := "2.12.8"

//resolvers += Resolver.sonatypeRepo("releases")
//resolvers += Resolver.sonatypeRepo("snapshots")


libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.7" % "test"
)

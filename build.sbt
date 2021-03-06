lazy val akkaHttpVersion = "10.1.11"
lazy val akkaVersion = "2.6.4"
lazy val scalaTestVersion = "3.1.1"

lazy val root = (project in file(".")).settings(
  inThisBuild(List(
    organization := "info.batey",
    scalaVersion := "2.12.8"
  )),
  name := "akka-http-typed",
  libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-http"            % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-http-xml"        % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-stream-typed"    % akkaVersion,
    "com.typesafe.akka" %% "akka-actor-typed"     % akkaVersion,

    "com.typesafe.akka" %% "akka-http-testkit"    % akkaHttpVersion  % Test,
    "com.typesafe.akka" %% "akka-testkit"         % akkaVersion      % Test,
    "com.typesafe.akka" %% "akka-stream-testkit"  % akkaVersion      % Test,
    "org.scalatest"     %% "scalatest"            % scalaTestVersion % Test
  )
)

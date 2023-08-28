lazy val commonSettings = Seq(
  version := "0.0.1",
  resolvers ++= Seq(
    Resolver.mavenLocal,
    Resolver.sonatypeRepo("releases"),
    Resolver.sonatypeRepo("snapshots"),
    "Bintray " at "https://dl.bintray.com/projectseptemberinc/maven"
  ),
  scalaVersion := "2.13.8",
  licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0")),
//  addCompilerPlugin("com.milessabin" % "si2712fix-plugin" % "1.2.0" cross CrossVersion.full),
  addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.13.2" cross CrossVersion.full),
  libraryDependencies ++= Seq(
//      "org.scalaz"                   %% "scalaz-core"                   % "7.2.4",
//      "org.scalaz"                   %% "scalaz-concurrent"             % "7.2.4",
//      "joda-time"                     % "joda-time"                     % "2.9.1",
//      "org.joda"                      % "joda-convert"                  % "1.8.1",
//      "io.spray"                     %% "spray-json"                    % "1.3.2",
//      "com.typesafe.akka"            %% "akka-actor"                    % "2.4.8",
//      "com.typesafe.akka"            %% "akka-persistence"              % "2.4.8",
//      "com.typesafe.akka"            %% "akka-stream"                   % "2.4.8",
//      "com.typesafe.scala-logging"   %% "scala-logging-slf4j"           % "2.1.2",
//      "com.typesafe.slick"           %% "slick"                         % "3.0.0",
//      "com.h2database"                % "h2"                            % "1.4.187",
//      "com.zaxxer"                    % "HikariCP-java6"                % "2.3.8",
//      "ch.qos.logback"                % "logback-classic"               % "1.1.3",
//      "org.scalacheck"               %% "scalacheck"                    % "1.12.5"       % "test"
  )
)

lazy val root = (project in file("."))
  .settings(commonSettings: _*)
  .settings(
    name := "frdomain",
    scalacOptions ++= Seq(
      "-feature",
      "-unchecked",
      "-language:higherKinds",
      "-language:postfixOps",
      "-deprecation"
    )
  )

#!/bin/sh
echo "deleting class-files"
rm *.class
echo "compiling scala files"
scalac -cp scalatest_2.10-2.0.jar Element.scala ElementSpec.scala

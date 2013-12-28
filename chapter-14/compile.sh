#!/bin/sh
echo "deleting class-files"
rm *.class
echo "compiling scala files"
scalac Element.scala ElementSuite.scala -cp scalatest_2.10-2.0.jar

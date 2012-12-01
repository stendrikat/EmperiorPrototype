#!/bin/bash

directory="./logs"
logfile="$directory/$1/compileOutput.log"

if [ -d $directory ]; then
	echo ""
else
	mkdir $directory
	cd $directory	
	echo "" > compileOutput.log
	cd ../../src
fi


ant -buildfile ./tasks/$1/src/build.xml clean > $logfile
ant -buildfile ./tasks/$1/src/build.xml compile > $logfile

if [ "$(grep 'SUCCESSFUL' $logfile)" ]; then
  ant -buildfile ./tasks/$1/src/build.xml test > $logfile
  ant -buildfile ./tasks/$1/src/build.xml show &
  if [ "$(grep 'SUCCESSFUL' $logfile)" ]; then
    exit 0
  else
    exit 2
  fi
else
  exit 1
fi

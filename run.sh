#!/bin/bash

if [ $# -ne 1 ]
then
    echo "Usage: ./run.sh [ClassName]"
    echo "e.g., ./run.sh Parity"
    exit
fi

java -XX:MaxJavaStackTraceDepth=5 -jar junit-platform-console-standalone-1.9.0.jar -class-path . --select-class $1 --disable-banner --details=tree --details-theme=unicode

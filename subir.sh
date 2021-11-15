#!/bin/bash
RUTA=$PWD
T= $pwd|rev|awk -F \/ '{print $1}'|rev
export RUTA
export T
cd
./git.sh

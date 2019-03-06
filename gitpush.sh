#!/bin/bash

#To use, enter sudo ./gitpush.sh in command line 
#Might have to use chmod +x gitpush.sh initially
git add *

git commit -m "update"

git push origin master

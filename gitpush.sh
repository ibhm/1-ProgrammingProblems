#!/bin/bash

#@Author Ibrahim Malik
#This is an automated bash script run on command line to update a git repo
#To use, enter sudo ./gitpush.sh in command line 
#Might have to use chmod +x gitpush.sh initially
git add *

git commit -m "update"

git push origin master

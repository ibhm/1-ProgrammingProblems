#!/bin/bash

#@Author Ibrahim Malik
#This is an automated bash script run on command line to update a git repo
#To use, enter sudo ./gitpush.sh in command line 
#Might have to use chmod +x gitpush.sh initially or enter a password

git add *

git commit -m "Update"

git push origin master

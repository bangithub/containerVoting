#!/usr/bin/env bash
echo "install Redis container and expose port 6379"
docker run --name redis -p 6379:6379 -d -v /home/patty/Documents/redis:/data redis:latest
echo "install Posgresql container and expose port 5432"
docker run --name postgres -p 5432:5432 -e POSTGRES_PASSWORD=password -d postgres:9.4

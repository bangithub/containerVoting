#!/usr/bin/env bash
./mvnw install dockerfile:build
 docker-compose -f docker-compose.yml up

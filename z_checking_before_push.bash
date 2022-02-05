#!/usr/bin/env bash

mvn clean install && docker-compose build && ./z_test-em-all.bash start stop
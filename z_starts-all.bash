#!/usr/bin/env bash

java -jar microservices/product-composite-service/target/*.jar &
java -jar microservices/product-service/target/*.jar &
java -jar microservices/recommendation-service/target/*.jar &
java -jar microservices/review-service/target/*.jar &
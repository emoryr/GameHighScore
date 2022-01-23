#!/bin/bash
set -e

echo "Building api docker image..."
cd api/
docker build -t com.sinch.gamehighscore/gamehighscore-api .
echo "Built api docker image..."


cd ../
echo "Running docker-compose up..."
docker-compose up -d
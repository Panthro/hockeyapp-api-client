if [ "$#" -ne 1 ]
then
  echo "Usage: './generate_client.sh <lang>' where lang is one of the supported swagger-codegen languages"
  echo "Example: ./generate_client.sh java"
  exit 1
fi
rm -rf $1

docker run -v `pwd`:/app -w /app --rm jimschubert/swagger-codegen-cli generate \
-i swagger.yaml \
-l $1 \
-o $1 \
--api-package com.github.panthro.hockeyapp \
--group-id com.github.panthro.hockeyapp \
--artifact-id hockeyapp-api

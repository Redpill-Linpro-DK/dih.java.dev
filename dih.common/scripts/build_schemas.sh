#!/bin/bash

java -jar ../tools/openapi-generator-cli.jar generate -g java -i ../schemas/sample-ingestion-oas.yml -o ../ -c build_schemas_config.yaml --artifact-version 1.0.0

mvn install -f ../

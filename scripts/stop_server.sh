#!/bin/bash

curl -X POST localhost:80/actuator/shutdown || true

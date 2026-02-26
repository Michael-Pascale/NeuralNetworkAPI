# Neural Network Training API

## Overview
A Spring Boot-based REST API designed to manage neural network training processes. This project allows users to create, train, fire, and manage neural networks through an API interface.

## Key Features
- Create and manage neural network models

### Features coming soon
- Train models using a simple input/output format
- Fire trained models with new inputs

## Building the project
### Caveats
This API requires [Java Neural Networks](https://github.com/Michael-Pascale/Java-Neural-Networks) In order to compile/run.
While I have a future enhancement planned to have the artifact from that repo published somewhere, for now you will need to follow
the following instructions in order to build.
1. Go to the neural network repository and follow instructions to build.
2. Add the jar to a folder in the repository called local-maven-repo. The pom should automatically pick it up.  

## Future enhancements
- Other db connection support with an ORM. 
- multi-thread/event pipeline for model interactions for async operations and concurrency.
- auth
- Better error handling so not every error comes back as a 500.
- Properly configure model persistence and add training api.

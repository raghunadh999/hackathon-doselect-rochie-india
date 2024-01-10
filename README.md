# FizzBuzz REST Server

## Overview
The FizzBuzz REST Server is an implementation of the classic Fizz-Buzz logic. It provides a REST API endpoint for Fizz-Buzz calculations and a statistics endpoint to track usage.

## Features
- **FizzBuzz Endpoint:** Accepts parameters to generate Fizz-Buzz sequences.
- **Statistics Endpoint:** Displays usage statistics based on Fizz-Buzz requests.

## Table of Contents
- [Installation](#installation)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)

## Installation
1. Clone the repository: `git clone https://github.com/raghunadh999/hackathon-doselect-rochie-india.git`
2. Navigate to the project directory: `cd fizzbuzz-rest-server`
3. Build the project: `mvn clean install`
4. Run the application: `java -jar target/fizzbuzz-rest-server.jar`

## Usage
1. Open a web browser or use a tool like [Postman](https://www.postman.com/) to interact with the API.
2. Access the FizzBuzz endpoint: `http://localhost:8080/fizzbuzz?int1=3&int2=5&limit=15&str1=Fizz&str2=Buzz`
3. Access the Statistics endpoint: `http://localhost:8080/statistics`

## Endpoints

### FizzBuzz Endpoint
- **URL:** `/fizzbuzz`
- **Method:** `GET`
- **Parameters:**
  - `int1`: Integer (required)
  - `int2`: Integer (required)
  - `limit`: Integer (required)
  - `str1`: String (required)
  - `str2`: String (required)
- **Example:** `/fizzbuzz?int1=3&int2=5&limit=15&str1=Fizz&str2=Buzz`

### Statistics Endpoint
- **URL:** `/statistics`
- **Method:** `GET`

## Testing
- Unit tests are implemented using JUnit 5 and can be executed with Maven:

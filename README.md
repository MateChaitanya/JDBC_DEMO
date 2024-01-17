# JDBC Tutorial

This repository contains code examples and a tutorial for connecting Java code to MySQL using JDBC (Java Database Connectivity). The tutorial covers various CRUD (Create, Read, Update, Delete) operations with MySQL using Java.

## Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Examples](#examples)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Java Database Connectivity (JDBC) is a Java-based API that provides a standard interface for connecting and interacting with relational databases. This repository serves as a tutorial to guide you through connecting your Java code with MySQL using JDBC and performing CRUD operations.

## Prerequisites

Before you begin, make sure you have the following prerequisites installed:

- Java Development Kit (JDK)
- MySQL Database Server
- MySQL Connector/J (JDBC Driver)

## Getting Started

1. Clone this repository to your local machine:

    ```bash
    git clone https://github.com/MateChaitanya/jdbc-tutorial.git
    ```

2. Set up your MySQL database and configure the connection parameters in the Java code.

3. Compile and run the Java code to test the JDBC connection and CRUD operations.

## Usage

The `src` directory contains the Java source code for various JDBC examples. Each example focuses on a specific aspect of JDBC, such as connection establishment, data insertion, retrieval, updating, and deletion.

To use the code:

1. Navigate to the `src` directory.
2. Compile the Java files:

    ```bash
    javac *.java
    ```

3. Run the Java programs:

    ```bash
    java ExampleClassName
    ```

Replace `ExampleClassName` with the name of the Java file you want to execute.

## Examples

- **Example 1: Connecting to the Database**
  - Demonstrates how to establish a connection to the MySQL database.

- **Example 2: Inserting Data**
  - Shows how to insert data into a MySQL table using JDBC.

- **Example 3: Retrieving Data**
  - Illustrates how to retrieve data from a MySQL table using JDBC.

- **Example 4: Updating Data**
  - Explains how to update existing records in a MySQL table using JDBC.

- **Example 5: Deleting Data**
  - Covers the process of deleting records from a MySQL table using JDBC.

Feel free to explore each example for a detailed understanding of the JDBC operations.

## Contributing

If you find any issues, have improvements, or want to contribute to this tutorial, feel free to open an issue or create a pull request.

## License

This project is licensed under the [MIT License](LICENSE).


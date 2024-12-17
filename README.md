# What the Number

This is a Java-based project that allows you to obtain **various properties** of a specified number. The packaged `.jar` file serves as a standalone Java application, exposing a **REST API** for user interaction.

## Table of Contents

- [Requirements](#requirements)
- [How to Run the Application](#how-to-run-the-application)
- [API Usage](#api-usage)
- [Example Response](#example-response)
- [Download the .jar File](#download-the-jar-file)

---

## Requirements

To run the `.jar` file, ensure you have the following installed:

- **Java Runtime Environment (JRE)**: Version 17 or higher.  
  Check your Java version by running:
  ```bash
  java -version
  ```
  If you don’t have Java installed, download it [here](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html).

---

## How to Run the Application

1. Download the `.jar` file from the [target folder](https://github.com/DiegoVSC42/what-the-number/blob/main/target/what-the-number-0.0.1-SNAPSHOT.jar).

2. Open your terminal or command prompt.

3. Navigate to the directory where you saved the `.jar` file:
   ```bash
   cd path/to/directory
   ```

4. Run the `.jar` file using the following command:
   ```bash
   java -jar what-the-number-0.0.1-SNAPSHOT.jar
   ```

5. The application will start and run on `http://localhost:8080`.

---

## API Usage

Once the application is running, you can interact with the API by sending an **HTTP GET request** to the following endpoint:

```
http://localhost:8080/number-info/{number}
```

Replace `{number}` with any desired integer.

Alternatively, you can access the hosted version of the application online:

```
https://what-the-number.up.railway.app/number-info/{number}
```

### Example

Request:

```http
GET https://what-the-number-production.up.railway.app/number-info/27
```

---

## Example Response

The API will return a JSON object containing various properties of the specified number. For example:

```json
{
	"value": 42,
	"basicNumPropertiesInfo": {
		"divisors": [1,2,3,6,7,14,21,42],
		"divisorsCount": 8,
		"tenFirstMultiples": [42,84,126,168,210,252,294,336,378,420],
		"factorial": 7538058755741581312,
		"parity": "EVEN",
		"perfect": false,
		"prime": false
	},
	"sequencePropertiesInfo": {
		"fibonacciSequence": {
			"nthFibonacciTerm": 267914296,
			"position": null,
			"isInFibonacci": false
		},
		"triangularSequence": {
			"nthTriangularTerm": 903,
			"position": null,
			"isInTriangular": false
		},
		"squareSequence": {
			"nthSquareTerm": 1764,
			"position": null,
			"isInSquare": false
		}
	},
	"advancedNumPropertiesInfo": {
		"mersenne": false,
		"palindrome": false,
		"harshad": true
	},
	"digitBasedOperationsInfo": {
		"numberOfDigits": 2,
		"digitSum": 6,
		"digitProduct": 8
	},
	"alternativeRepresentationsInfo": {
		"binary": "101010",
		"hexadecimal": "2A",
		"octal": "52"
	},
	"otherMathematicalOperationsInfo": {
		"squareRoot": 6.48074069840786,
		"cubeRoot": 3.4760266448864496,
		"naturalLogarithm": 3.7376696182833684,
		"logarithmBaseTen": 1.6232492903979006
	}
}
```

---

## Download the .jar File

You can directly download the `.jar` file from the following link:

➡ [what-the-number-0.0.1-SNAPSHOT.jar](https://github.com/DiegoVSC42/what-the-number/blob/main/target/what-the-number-0.0.1-SNAPSHOT.jar)

---

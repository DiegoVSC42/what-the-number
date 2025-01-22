# What the Number

This is a Java-based project that allows you to obtain **various properties** of a specified number.

## Table of Contents

- [API Usage](#api-usage)
- [Example Response](#example-response)
- [Front-End](https://github.com/DiegoVSC42/what-the-number-frontend)

---

## API Usage

Once the application is running, you can interact with the API by sending an **HTTP GET request** to the following endpoint:

```
http://localhost:8080/number-info/{number}
```

Replace `{number}` with any desired positive integer.

Alternatively, you can access the hosted version of the application online:

```
https://what-the-number.up.railway.app/number-info/{number}
```

### Example

Request:

```http
GET https://what-the-number.up.railway.app/number-info/27
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
		"decimal": "42"
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

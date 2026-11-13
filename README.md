# Campus Cafe Inventory

## GitHub repository

https://github.com/praveen-210/Airtribe

A console-based Java program for adding, listing, valuing, restocking, and duplicating cafe products. It uses only the standard Java library (`java.util.Scanner`).

## Run the programs

Install a standard JDK, open a terminal in this folder, and compile the inventory program:

```sh
javac Product.java Main.java
java Main
```

Run the warm-up separately:

```sh
javac Warmup.java
java Warmup
```

`output.txt` contains a complete sample inventory session covering all menu options, an invalid menu choice, and a rejected product.

## Deliverable questions

### What did you predict for Warmup.java, and what did it actually print? Explain the lines that surprised you.
A reasonable prediction is `7 5.0 -126`, followed by `Two` and `Three`. The cast from `7.9` removes the fractional part, converting `130` to a signed byte wraps it to `-126`, and the switch continues into case 3 because there are no `break` statements.

### What is the difference between the static variable totalProducts and the instance variable name?
`totalProducts` is static, so there is one shared counter for the `Product` class rather than a separate counter in every object. `name` is an instance variable, so each product keeps its own name.

### What does the copy constructor do, and why does changing p2.name not change p1.name?
The copy constructor creates a new `Product` and copies the source product's name, price, and quantity into it, then increments the shared product counter. The two objects hold their own `name` fields, so assigning a different name to the copy does not alter the original.

### Why does Java force you to write (int) average when converting a double to an int, and what happens to the decimal part?
A `double` can hold a wider range of values and fractional parts than an `int`, so Java requires an explicit cast to acknowledge that information may be lost. Casting a positive average to `int` truncates the fractional part, which is equivalent to rounding down for the positive prices used here.

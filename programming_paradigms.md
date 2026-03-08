# Programming Paradigms

A programming paradigm is a way of thinking about and structuring a program's functionality. Programming paradigms differ from one another, for example in how the program's execution and control are defined and what components the programs consist of.

Most programming languages ​​that are currently in use support multiple programming paradigms. Part of a programmer's growth involves the ability, through experience, to choose the appropriate programming language and paradigm; there currently is no single ubiquitous programming language and programming paradigm.

The most common programming paradigms today are:
- Object-Oriented Programming (OOP)
- Procedural Programming
- Functional Programming

This document focuses on the first two paradigms.

---

## Object-Oriented Programming (OOP)

In object-oriented programming, information is represented as **classes** that describe the concepts of the problem domain and the logic of the application. Classes define the **methods** that determine how information is handled. During program execution, **objects** are instantiated from classes that contain runtime information and that also have an effect on program execution: program execution typically proceeds through a series of method calls related to the objects. As mentioned, "the program is built from small, clear, and cooperative entities."

**History:**
- The basic ideas of OOP first appeared in Simula 67 (for simulations) and Smalltalk.
- OOP became widely popular in the 1980s through C++ and later Java.

**Benefits:**
- Models problem-domain concepts through classes and objects, making programs easier to understand.
- Facilitates construction and maintenance of programs.

**Limitations:**
- Not inherently suited to all problems (e.g., scientific computing and statistics often use R or Python).

### Example: OOP Clock

```java
public class Hand {
	private int value;
	private int upperBound;

	public Hand(int upperBound) {
		this.upperBound = upperBound;
		this.value = 0;
	}

	public void advance() {
		this.value = this.value + 1;
		if (this.value >= this.upperBound) {
			this.value = 0;
		}
	}

	public int value() {
		return this.value;
	}

	public String toString() {
		if (this.value < 10) {
			return "0" + this.value;
		}
		return "" + this.value;
	}
}

public class Clock {
	private Hand hours;
	private Hand minutes;
	private Hand seconds;

	public Clock() {
		this.hours = new Hand(24);
		this.minutes = new Hand(60);
		this.seconds = new Hand(60);
	}

	public void advance() {
		this.seconds.advance();
		if (this.seconds.value() == 0) {
			this.minutes.advance();
			if (this.minutes.value() == 0) {
				this.hours.advance();
			}
		}
	}

	public String toString() {
		return hours + ":" + minutes + ":" + seconds;
	}
}

Clock clock = new Clock();
while (true) {
	System.out.println(clock);
	clock.advance();
}
```

---

## Procedural Programming

In procedural programming, the structure of the program is formed by the **functionality** desired: the program acts as a step-by-step guide for the functionality to be performed. The program is executed one step at a time, and subroutines (methods) are called whenever necessary.

- The state of the program is maintained in variables and tables.
- Methods handle only the values provided to them as parameters.
- The program tells the computer what should happen, step by step.

### Example: Swapping Two Variables

```java
int a = 10;
int b = 15;
// swap values
int c = b;
b = a;
a = c;
```

### Example: Procedural Clock

```java
int hours = 0;
int minutes = 0;
int seconds = 0;

while (true) {
	// 1. printing the time
	print(hours, minutes, seconds);
	System.out.println();

	// 2. advancing the second hand
	seconds = seconds + 1;

	// 3. advancing the other hands when necessary
	if (seconds > 59) {
		minutes = minutes + 1;
		seconds = 0;
		if (minutes > 59) {
			hours = hours + 1;
			minutes = 0;
			if (hours > 23) {
				hours = 0;
			}
		}
	}
}

public static void print(int hours, int minutes, int seconds) {
	print(hours);
	print(minutes);
	print(seconds);
}

public static void print(int value) {
	if (value < 10) {
		System.out.print("0");
	}
	System.out.print(value);
}
```

---

## Comparison: OOP vs Procedural

- **OOP:** State is encapsulated in objects; methods can change object state, which may affect other objects.
- **Procedural:** State is maintained in variables; methods operate only on parameters and global state.

The difference is shown in the clock examples above: OOP organizes code around objects (hands, clock), while procedural organizes code around steps and functions.

---

## Summary

- Programming paradigms are different ways to structure and think about programs.
- Most languages support multiple paradigms.
- Choosing the right paradigm depends on the problem and the programmer's experience.

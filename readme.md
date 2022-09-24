# Introduction to JAVA

Java is one of the most popular languages in the world.
It is an object-oriented language with a garbage collector, features that made
java stand out from the languages of its time.

## How to install Java

There are many ways of installing java on your machine, but one of the best ways is to
use a java version manager of choice. In this case, I will use [Jabba](https://github.com/shyiko/jabba), to install Jabba:

```bash
> curl -sL https://github.com/shyiko/jabba/raw/master/install.sh | bash && . ~/.jabba/jabba.sh
```

_to check if Jabba was successfully downloaded use the command: "jabba"_

### Installing a Java version and using it

To install a specific version of java you need to run the following command:

```bash
> jabba install openjdk@1.11.0
```

To visualize all versions installed using Jabba run the following command:

```bash
> jabba ls
```

To **use** a specific installed version of java run the command:

```bash
> jabba use openjdk@1.11.0
```

## Running the first program

To run the first program create a folder called "src" and create a file named "Program.java".

```java
class Program {
    public static void Program(String[] args) {
        System.out.println("Hello, world!");
    }
}
```

To compile:

```bash
> javac -d target/ -sourcepath src/ src/Program.java
```

Running the program:

```bash
> cd target/
> java Program
```

## Creating the first project

A project can be a program that has functionality and utilizes multiple other classes and
files to achieve that functionality. Having what was said in mind, create the following folder
structure for our first project:

```
├── src 📂
    ├── Program.java ☕
    └─── utils 📂
         └─── Guesser.java
         └─── Result.java
```

The project that we are creating is a very simple program in Java that is a guessing game.
To play the game the player has to insert an integer value on the prompt,
if the guess is equal to the value generated at the start of the program the user win
and the program ends, if the value is incorrect the user has to insert another value until it is the correct one.

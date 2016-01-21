CompSci 308 : RPS Design
===================

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

Initial Design
=======

###Class 1 - Game Class

* HashMap of Strings to Objects (RPS Choice Objects)

* getWinner() Method that takes in 2 RPS Choice Objects, returns a String for which RPS Choice wins or blank String if they tie.

* Constructor takes in HashMap of RPS Objects

* begin() method 
	- Prompts user for two Strings
	- uses HashMap to find RPS Choice objects
	- checks which RPS Choice object wins using getWinner()
	- loops


###Class 2 - Main Class

* Main method 
	- reads in stuff from file 
	- creates the RPS Choice objects and adds to HashMap
	- initializes new instance of Game Class with HashMap
	- game.begin()


###Class 3 - RPS Choice Class

* HashSet of Strings for RPS Choices that it beats

* Getters and Setters for name and HashSet

* Constructor - takes in a name and HashSet of Strings



CRC Design
=======

###Class 1


###Class 2

You can add images as well:

![This is cool, too bad you can't see it](crc-example.png "Our CRC cards")


Use Cases
=======

You can put blocks of code in here like this:
```java
    public int getTotal (Collection<Integer> data) {
        int total = 0;
        for (int d : data) {
            total += d;
        }
        return total;
    }
```


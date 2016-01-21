CompSci 308 : RPS Design
===================

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

Initial Design
=======

###Class 1 - Game Class

* HashSet of Objects (RPS Choice Objects)

* Method that takes in 2 RPS Choice Objects, returns a String for which RPS Choice wins or blank String if they tie.

* Constructor takes in HashSet of RPS Objects

* Step method that takes user input, 


###Class 2 - Main Class

* Main method 
	- reads in stuff from file 
	- creates the RPS Choice objects
	- adds them HashSet 
	- creates new instance of Game Class.


###Class 3 - RPS Choice Class

* String for name

* HashSet of Strings for RPS Choices that it beats

* Getters and Setters for name and HashSet

* Constructor - takes in a name and ArrayList of Strings



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


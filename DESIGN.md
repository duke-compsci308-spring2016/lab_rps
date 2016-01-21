CompSci 308 : RPS Design
===================

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

Initial Design
=======

###Class 1 - Game Class

* HashMap of Strings to HashSet<String>
	- map.get(choice) returns a HashSet of Strings that represent the RPS weapons that this choice beats.

* getWinner() Method that takes in 2 Strings that represent choices
	- if statements use HashMap to check if String choice1 occurs in map.get(choice2) or vice versa
	- returns a String for which RPS Choice wins or blank String if they tie

* Constructor takes in HashMap of Strings to HashSet<String>

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


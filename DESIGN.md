Cody Li (cl305), David Yang (dy46) 
Lab 2 

CompSci 308 : RPS Design
===================

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

Initial Design
=======

###Class 1 - Game

* Methods
	* Reading in data from files (1)
		* Parameter: input.txt as InputStream
		* Use Scanner class to read in text files. 
		* return a parsed ArrayList<String>

	* Parse data to create mappings (2)
		* Parameter: ArrayList<String>
		* Use for loop to parse through the ArrayList<String>
		* return a HashMap<String, ArrayList<String>> where key is move and ArrayList is collection of moves that defeat key

	* Users choose what kind of format they want to play (2 out of 3, 3 out of 5, etc.) (3)
		* Parameter: integer from user input
		* This integer determines what the "best of" is
		* Store integer as an instance variable
		* Is a void method 
	* Generate AI weapon (4)

	* Determine winner(5) 
		* Parameter: String weaponPlayer, String weaponComputer
		* Method takes in String weapon and compares it to the keySet of the HashMap of weapons
		* Uses HashMap.get(weaponPlayer) to return corresponding ArrayList
		* Call isTie method
		* Use value return from Check Weapon method 
		* return boolean, true if player won, false if player lost 

	* 

	* Check moves to see if there is a tie
		* Parameters: String weaponPlayer, String weaponComputer
		* if equal, print "tie", restart round, call promptUser method
		* else, call method below

	* Checks arraylist of weapon
		* Parameter: String weaponComputer, ArrayList<String> playerDefeats
		* Check if playerDefeats contains weaponComputer
		* return if arraylist contains weaponComputer

	
	* Returns user score and determines if game is over

1. You can also order things with numbers


###Class 2 - Main 

* Methods
	*  Prompt user for weapon and check for weapon validity 


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


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

	* Determine winnerRound(5) 
		* Parameter: String weaponPlayer, String weaponComputer
		* Method takes in String weapon and compares it to the keySet of the HashMap of weapons
		* Uses HashMap.get(weaponPlayer) to return corresponding ArrayList
		* Call isTie method
		* Use value return from Check Weapon method 
		* return boolean, true if player won, false if player lost 

	* Update player score
		*	Parameter: boolean playerWin
		* if playerWin -> playerScore++
		* else computerScore++

	* Check moves to see if there is a tie
		* Parameters: String weaponPlayer, String weaponComputer
		* if equal, print "tie", restart round, call promptUser method
		* else, call method below

	* Checks arraylist of weapon
		* Parameter: String weaponComputer, ArrayList<String> playerDefeats
		* Check if playerDefeats contains weaponComputer
		* return if arraylist contains weaponComputer

	
	* Returns user score and determines if game is over
		* Parameter: User score
		* if playerScore == ceil(roundNum / 2) 
		* Call getWinner method in main
		* else, nothing happens 


###Class 2 - Main 

* Methods
	*  Prompt user for weapon and check for weapon validity 

	* Return winner of round
		*	Print the winner of the round

	* Return winner of the set
		* Print the winner of the set


CRC Design
=======

###Class 1


###Class 2

You can add images as well:

![This is cool, too bad you can't see it](crc-example.png "Our CRC cards")


Use Cases
=======

You can put blocks of code in here like this:
Use case 2
```java
public class RPSGame{
	public ArrayList<String> readFile(InputStream input) {
		return ArrayList<String> dataList;
	}
	public HashMap<String, ArrayList<String>> parseData(ArrayList<String> list) {
		return HashMap<String, ArrayList<String>>;
	}
}

public class RPSMain{
    public HashMap<String, HashSet> loseSet;
    public static void main(String[] args){
    	RPSGame myGame = new RPSGame();
    	ArrayList<String> dataList = myGame.readFile(input.txt);
    	loseSet = myGame.parseData(dataList);
    	String weaponPlayer = myGame.promptUser();
	}
	public promptUser(){
		return weaponPlayer;
	}
}
```


CompSci 308 : RPS Design
===================

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

Initial Design
=======

###Player Class

Player class controls a user that plays the game, allowing for picking of a weapon and updating score
Player knows its:
* score
* name
* currentWeapon

Methods- 
* chooseNextWeapon
* public void setScore(int i) [Passing in the int to which the score is to be set]
* public int getScore [outputs the score]

###UserPlayer Class

UserClass will implement the player class.  It will be used for human users.  

###ComputerPlayer Class

ComputerPlayer will implement the player class.  It will be for cpu challengers.  In addition to the player
class' capabilities it will need a decision making capability. 
ComputerPlay has:
* difficulty

Methods-
* makeNextMoveDecision

###Weapon Class

Defines the general structure for a weapon
Contains:
* name
* Image
* weaponID [constant that identifies the different type of weapons]

Methods-
* show [displays the image of the screen]

###Main Class

Initializes the game, passes the input data to the information engine to process and 
generates a new GamePlay class (depending on whether the players are human or cpu) with the given information
engine 

methods-
* readInput [gets the input]
* main method
* intializeNewGame
* addNewGameType [sends a new file to the DataEngine, which generates a new Graph]

###GamePlay Class

The game class controls the game loop
The game loop will:
1. Update the player weapon choice
2. play 
3. updatePlayer

Methods-
* shoot/step [makes a choice on which players' weapon wins] 
* updatePlayer [updates the player state] 

The GamePlay Class will have:
* 2 Players (it should be able to handle different type of players; both CPU and User)
* DataEngine dataEngine


##DataEngine 

Loads the input data and creates the algorithm to determine which weapon beats another
It will contain the instances of the weapons and give out information useful for the GamePlay Class

Methods-
* generateGraph
* getWinner (Weapon1, weapon2) [Uses the graph to determine the winner between the two weapons]

CRC Design

=======

###Player

Methods- 
* public void chooseNextWeapon();
* public void setScore(int i) [Passing in the int to which the score is to be set];
* public int getScore [outputs the score];
* public void getName();
* public void setName(String name);

Has-
* private Weapon currentWeapon

###Main 

Methods- 
* public void intializeNewGame(GameEngine e);
* private GameEngine createGameType(File f);

###Weapon 

Methods- 
* public int getID() [Each weapon has a constant int for identification purposes]
* public Image getImage()

##DataEngine

Methods- 
* private Map generateGraph()
* public Map getGraph()
* public  Map setGraph(Map m)
* public Weapon determineWinner(Weapon w1, Weapon w2) //Returns winning weapon (null on tie)

##GamePlay

Methods- 

* public void pause();
* public void resume();
* public void shoot(); -> essentially the game loop

Has:
*Players
*DataEngine

Use Cases
=======

You can put blocks of code in here like this:
Starting a new game: in Main
```java

    intializeNewGame()
```
Choosing a new weapon: in GamePlay class (somewhere in the shoot method)
```java
	
	Player1.chooseNextWeapon();
	Player2.chooseNextWeapon();
		
```
Chooses winner, outputs score: in GamePlay class (somewhere in the shoot method)
```java
	
	Weapon choice1 = player1.getWeapon();
	Weapon choice2 = player2.getWeapon();
	Weapon winner = dataEngine.getWinner(choice1, choice2);
	if (winner == null) {
		//tie- do nothing
	} else if(winner.getID() == choice1.getID()) {
		//Player1 wins
		Player1.setScore(Player1.getScore()++);
	} else {
		//Player2 wins
		Player2.setScore(Player1.getScore()++);
	}
		
```
Adding a new game type - create a new game with its own data engine.  Each data engine will handle the 
getWinner method differently depending on the graph set




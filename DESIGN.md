CompSci 308 : RPS Design
===================

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

Initial Design
=======

The initial design will have an overall engine class that reads in the possible options and stores it in a data structure for later use. The engine will initialize two Player classes. These Player classes will keep track of their scores and the current weapon that is selected. Player will also have a method that will be called at the beginning of each round that lets the player choose their next weapon. The HumanPlayer class, the decideNextWeapon method will prompt the user to select their weapon of choice. In the ComputerPlayer class, the decideNextWeapon will 
###RPSEngine
* playerOne
* playerTwo
- startNextRound()



###Player
* playerScore
* currentWeapon
- getCurrentWeapon()
- setCurrentWeapon()
- abstract decideNextWeapon()

###HumanPlayer
- decideNextWeapon()

###ComputerPlayer
- decideNextWeapon()




CRC Design
=======

###RPSEngine
* Player playerOne
* Player playerTwo
* DataEngine dataEngine
- private void initializeNewGame()
- private void startNextRound()
- private void incrementScores(Weapon)

###Player
* private int playerScore
* private Weapon currentWeapon
- public Weapon getCurrentWeapon()
- private void setCurrentWeapon()
- public void abstract decideNextWeapon()

###HumanPlayer
-public void decideNextWeapon()

###ComputerPlayer
-public void decideNextWeapon()

###DataEngine
- private void readData(File)
- public Weapon getWinner(Weapon, Weapon)


Use Cases
=======

```java

	RPSEngine.initializeNewGame();
```

```java

	playerOne.decideNextWeapon();
	playerTwo.decideNextWeapon();
```

```java

	Weapon weapon1 = playerOne.getCurrentWeapon()
	Weapon weapon2 = playerTwo.getCurrentWeapon()
	Weapon winningWeapon = dataEngine.getWinner(weapon1, weapon2)
	incrementScores(winningWeapon)
```


```java

	// This code assumes that the new data relationships are defined in a new file
	File newFile = new File(filepath)
	dataEngine.readData(newFile)
```

```java

	// This code assumes that the new data relationships are defined in a new file
	File newFile = new File(path)
	dataEngine.readData(newFile)
```


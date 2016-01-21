CompSci 308 : RPS Design
===================

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

Initial Design
=======

###Controller

Contains the game's info (player scores, win conditions, etc.). Main liason with the UI




###Battle Matrix

Contains the main weapon relationships structure. It takes in what the controller has, and computes the actual win/loss/draw.

###Player

Contains score and name

CRC Design
=======

###Controller

void resetGame(): Updates players' scores to 0.

void receivePlayerChoices( int weapon1, int player ): receives the player's choice from the UI, and stores it. When both players have chose, it calls BattleMatrix's *checkWinner* and *incrementScore* afterwards.

void receiveRelationships(FILE): takes new File from UI and directs it to BattleMatrix class.

###BattleMatrix

void setMatrix(FILE): gets the file and creates/updates the relationship matrix.

void resetMatrix(): Wipes the matrix clean, to start a new game

int checkWinner( int weapon1, int weapon2 ): takes the weapon choices, looks up the table and gives the winner as output (-1, 0 or 1 for player 1 loss, draw and win, respectively).

###Player

void incrementScore(): score++

void resetScore(): score = 0

int getScore(): return score.

Simple enough.

You can add images as well:

![This is cool, too bad you can't see it](crc-example.png "Our CRC cards")


Use Cases
=======

•  New game starts, score reset
```java
    resetGame();
   
    resetMatrix();
```

• New player chooses RPS weapon
```java
	receivePlayerChoices( weapon, player );
```

• Given 2 choices, one player wins and scores are updated
```java
	receivePlayerChoices( weapon, player );
	receivePlayerChoices( weapon, player );

	checkWinner( weapon1, weapon2 );

	incrementScore();
```

• A new choice is added
```java
	receiveRelationships(FILE);

	setMatrix(FILE);
```

• A new game is added
```java
	resetGame();
	receiveRelationships(FILE);

	resetMatrix();
	setMatrix(FILE);
```











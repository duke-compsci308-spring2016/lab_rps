CompSci 308 : RPS Design
===================

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

Initial Design
=======

###Class 1- Player 

* Player would contain both a player's score, weapon choice, and general information (name, school, class) about the player.

###Class 2 - Engine - takes in the choices of player A and B, parser, and a max score to determine an overall winner..

*Engine compares the weapon choice for both players and determines which player is the winner for that round.
*To do this, an engine takes in a parser, which contains a directed graph containing all winning and conditions for each possible weapon pair. The engine determines from the weapon combination graph which player is the winner for that round, and updates the score of the player. Based on the scores of the players, the engine determines whether a player has reached a max score and won the overall competition.

###Class 3 - Parser

Parser would read in a text containing a table of the win and lose conditions for each weapon. The table would look like a matrix of 1's, -1's, and 0's. 1 denotes weapon A defeats weapon B, -1 denotes that weapon B defeats weapon A, and 0 denotes that weapon A is the same weapon as weapon B. The Parser would output a directed graph, in which the direction of each segment determines the stronger weapon for that pair. The parser should also have a method that allows a user to input a list (or collection), and the directed graph generated from the original table will be expanded to include the new weapons as nodes. Also, additional methods could be used such as addRelationship(), editRelationship(), and removeRelationship() just to give the game-maker more control over which weapons defeat other weapons.



### Class 4- Weapons


CRC Design
=======

###Class 1 - Player

The player interacts with the engine to provide weapon choices, and the engine interacts the player to determine which player increases his score.

**Class Player** 
- void setName(String name) 
- void setChoice(Weapon choice)                     SOLVES USE CASE 2
- int getScore() 
- Weapon getWeapon(); 
- String getName();  
- void addWin(); 
- void addLoss();
- void setscore(int a, int b);                     SOLVES USE CASE 1


###Class 2 - Engine

The engine interacts with the player (as described above) and with the parser to determine which player is the winner for each round.

class Engine:
private final int WINNING_SCORE = 10; 

//Uses the directed graph within Parser and the weapon selections within Player to return the winning Player
public Player getWinner(Player playerOne, Player playerTwo, Parser parser){                 USE CASE 3
...
}

//compares scores to determine overall winnder
public boolean isEndOfGame(Player playerOne, Player playerTwo){
...
}

//Given a winner, it increments the score
public void updateWinnerScore(Player playerOne){
...
}

public void addnewPlayers (Player1, Player2)                    USE CASE 5

Defines new players 

###Class 3 -Parser

The parser interacts with the enginer to help the engineer determine which player is the winner.

public Graph createGraph(textfile text)                   USE CASE 5

//Creates a graph if one does not already exist, using a textfile.

public void addtoGraph(ArrayList)

//Adds to an already existing graph with more weapons with unset conditions for the weapons.

public void addRelationship(Weapon 1, weapon 2, int n)

// Adds a relationship on the graph between Weapon 1 and Weapon 2. It takes an integer n, which depending on whether it is positive, negative, or 0, determines the winner of the weapon. 1 means Weapon 1 defeats Weapon 2, -1 means Weapon 2 defeats Weapon 1, 0 means there is no relationship between the weapons.

public void addWeapon(Weapon 1)                     USE CASE # 4.

//adds a weapon to a graph. The graph is immediately updated and relationships are assigned to fill in the relationships to other weapons.

public void removeRelationship(Weapon 1, weapon 2)

// deletes from the graph a relationship between weapon 1 and weapon 2.

public void flipRelationship(weapon 1, weapon 2)

// Changes the direction of the relationship on the graph between weapon 1 and 2.


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


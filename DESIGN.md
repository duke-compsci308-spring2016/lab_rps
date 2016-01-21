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



CRC Design
=======

###Class 1 - Player

The player interacts with the engine to provide weapon choices, and the engine interacts the player to determine which player increases his score.

###Class 2 - Engine

The engine interacts with the player (as described above) and with the parser to determine which player is the winner for each round.

###Class 3

The parser interacts with the enginer to help the engineer determine which player is the winner.

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


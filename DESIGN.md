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
Methods: 
-setWeaponChoice

###UserPlayer Class

UserClass will implement the player class.  It will be used for human users.  

##ComputerPlayer Class

ComputerPlayer will implement the player class.  It will be for cpu challengers.  In addition to the player
class' capabilities it will need a decision making capability. 
ComputerPlay has:
*difficulty
Methods:
-makeNextMoveDecision

###Weapon Class

Defines the general structure for a weapon
Contains:
*name
*Image
*weaponID [constant that identifies the different type of weapons]

Methods-
-show [displays the image of the screen]

###Main Class

Initializes the game, passes the input data to the information engine to process and 
generates a new GamePlay class (depending on whether the players are human or cpu) with the given information
engine 
methods:
-readInput [gets the input]
-main method

###GamePlay Class

The game class controls the game loop
The game loop will:
1. Update the player weapon choice
2. play 
3. updatePlayer
Methods-
shoot [makes a choice on which players' weapon wins] 
updatePlayer [updates the player state] 

The Game Class will have:
*2 Players (it should be able to handle different type of players; both CPU and User)
*DataEngine


##DataEngine 

Loads the input data and creates the algorithm to determine which weapon beats another
It will contain the instances of the weapons and give out information useful for the GamePlay Class
Methods-
*generateGraph
*getWinner (Weapon1, weapon2) [Uses the graph to determine the winner between the two weapons]
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


CompSci 308 : RPS Design
===================

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

CRC Design
=======

###Weapon

####Responsibilities

* To keep track of what weapons beat this one
* To keep track of what weapons this one beats

####Attributes

* String myName
* Set of Weapons beatsMe
* Set of Weapons iCanBeat

####Methods

* Find relationship to another weapon (takes in another weapon, returns boolean)


###Game

####Attributes

* Player player1
* Player player2
* int player1Score
* int player2Score
* Set of Weapon legalWeapons

####Methods

* Insert new weapon (void, adds one weapon to legalWeapons, update all relevant relationships)
* Start new round (returns new Round)


###Round

####Responsibilities

* Keep track of weapons chosen by both players 
* Determine a winner for the round

####Atributes

* Weapon player1Weapon
* Weapon player2Weapon

####Methods

* Need to determine if both weapons selected (returns boolean)
* Need to determine winner (returns the relationship of player1Weapon to player2Weapon)
* Need to query both players for weapons (getters for Weapons)
* Need to increment score (use setter for Game class)

===

###Player

####Attributes

* String myName
* Weapon selectedWeapon

####Methods

* Update weapon (and return boolean when completed)



Use Cases
===========

### Playing the game

1. Start with a Set of Weapons and the relationships between them.
2. Create a new Game object, update Players in the game, use the relationships.
3. Create a new round. 
4. Once both players select their weapons, find the winner. Then appropriately update the score and reset.

###Inserting a new weapon

1. Design a Weapon and create the relationships. Add this Weapon to the game legalWeapons.
2. For all other relevant weapons, add relationship to the new weapon.
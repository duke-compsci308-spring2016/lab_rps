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
* Set<Weapon> beatsMe
* Set<Weapon> iBeatThem

####Methods

* Find relationship to another weapon
===

###Game

####Attributes

* Player player1
* Player player2
* int player1Score
* int player2Score
* Set<Weapon> legalWeapons

####Methods

* Insert new weapon
* Start new round

===

###Round

####Responsibilities

* Keep track of weapons chosen by both players
* Determine a winner for the round

####Atributes

* Weapon player1Weapon
* Weapon player2Weapon

####Methods

* Need to determine if both weapons selected
* Need to determine winner
* Need to query both players for weapons
* Need to increment score

===

###Player

####Attributes

* String myName
* Weapon selectedWeapon

####Methods

* Update weapon (and return boolean when completed)

==================

Use Cases

### Playing the game

1. Start with a Set of Weapons and the relationships between them.
2. Create a new Game object, update Players in the game, use the relationships.
3. Create a new round. 
4. Once both players select their weapons, find the winner. Then appropriately update the score and reset.

###Inserting a new weapon

1. Design a Weapon and create the relationships. Add this Weapon to the game legalWeapons.
2. For all other relevant weapons, add relationship to the new weapon.
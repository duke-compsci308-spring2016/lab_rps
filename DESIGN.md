CompSci 308 : RPS Design
===================

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

Initial Design
=======

###Weapon

* General class for each weapon, doesn’t store what it beats/what beats it
* Knows weapon display attributes

###WeaponSet

* Stores all of the weapons the Player can use

###Rules

* Rule set decides what beats what- game gives it 2 weapons and it decides on the winner based on its info

###Player

* Creates player, attaches weapon selected, and maintains win/loss for player

###Game

* Runs game after creating x players, uploading data file for game, and populating the weapon set

CRC Design
=======

###RPS
**Responsibilities**

* createRules(String fileName) returns Rules
* createWeaponSet(String fileName) returns WeaponSet
* createPlayers(int numPlayers) returns List<Players>
* startGame(Rules r, WeaponSet w, List<Players> p) returns Player (winner)

**Colaborators**

* Rules
* WeaponSet
* Player

###Game
**Responsibilities**

* createPlayers() return: void
* simulateRound(Player p1, Player p2) return: void
* resetGame() return: void
* Plays game between players
* Initiates new rounds

**Collaborators**

* Players
* Rules

###Rules
**Responsibilities**
*addRule(Weapon w1, Weapon w2) return void
*deleteRule(Weapon w1, Weapon w2) return void
*getWinner(Weapon w1, Weapon w2) return int outcome (-1, 0, 1)

**Collaborators**

* Weapons

###Player
**Responsibilities**
* getScores() return int
* updateScore(Int result) return void
* chooseWeapon() return Weapon
* resetScore() return void


**Collaborators**
*WeaponSet

###WeaponSet
**Responsibilities**

* getWeaponList() returns List<Weapon>
* Updates enum based on input data file
* addWeapon(Weapon w) return void
* deleteWeapon(Weapon w) return void

**Collaborators**

* Weapon

###Weapon
**Responsibilities**

* getWeaponName() return String


**Collaborators**
* WeaponSet
* Rules

You can add images as well:

![This is cool, too bad you can't see it](crc-example.png "Our CRC cards")


Use Cases
=======

* A new game is started with two players, their scores are reset to 0.
```java
// In Game class
List<Players> newPlayers = createPlayers(2);
// Assuming Rule rules, WeaponSet weaponset
startGame(rules, weaponset, newPlayers);
```
* A player chooses his RPS "weapon" with which he wants to play for this round.

```java
	Weapon chooseWeapon(){

}

```
* Given two players' choices, one player wins the round, and their scores are updated.

```java
int getWinner(Player p1, Player p2){
	//compare weapons
	//1 - p1 weapon wins, 0 - tie, -1 p2 weapon wins
}



```
* A new choice is added to an existing game and its relationship to all the other choices is updated.
```java
Weapon newChoice = new Weapon(name);
weaponset.addWeapon(newChoice);
// Assume choices it beats is in List<Weapon> winners -> from input file
// Assume choices it loses to is in List<Weapon> losers -> from input file
for(Weapon w: winners){
	rules.addRule(newChoice, w); // Winning choice comes first
}
for(Weapon w: losers){
	rules.addRule(w, newChoice); 
}
```
* A new game is added to the system, with its own relationships for its all its "weapons".
```java
resetGame()
// Assuming Rule r, WeaponSet w, Player p
startGame(r, w, p)
```




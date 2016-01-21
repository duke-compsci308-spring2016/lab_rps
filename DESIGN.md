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

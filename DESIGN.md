CompSci 308 : RPS Design
===================

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

#Design
####By Blake Kaplan (bjk20), Patrick Grady (plg5), Bobby Wang (bcw22), and Justin Bergkamp (jtb43)

###Class: Weapon

* A class that can be instantiated for any weapon based on what is fed into the constructor

Methods:
```java
//Used for updating the inter-weapon game dynamics
public void addBeats(Weapon beatWeapon)

//Determines the result when two weapons are played against each other
public boolean doesBeat(Weapon otherWeapon)
```
Instance Variables:
`List<Weapon> beats`


###Class: Player

* Represents each game player
* Will be able to determine which weapon it would like to throw

Methods:
```java
//Generates a Weapon that the user throws
public Weapon pickWeapon()

//Gets the players current score
public int getScore()
public boolean doesBeat(Player otherPlayer)
public Weapon getCurrentWeapon()
public void setScore(int score)
```
Instance Variables:
`Weapon currentWeapon`
`int myScore`
`List<Weapon> priorThrows`

###Class: Game
* The central game class
* Will have to have an initialization method(s) where it properly configures which weapons beat which other weapons

Methods:
```java
//Starts the game and generates the GUI
public void start()
```

Instance Variables:
`int roundsElapsed`
`List<Player> players`
`List<Weapon> weapons`
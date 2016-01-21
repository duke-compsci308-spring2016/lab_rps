CompSci 308 : RPS Design
===================

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

#Design
####By Blake Kaplan (bjk20), Patrick Grady (plg5), Bobby Wang (bcw22), and Justin Bergkamp (jtb43)

###Class: Weapon

* A class that can be instantiated for any weapon based on what is fed into the constructor
* Methods:
```java
public void addBeats(Weapon beatWeapon)
public void addAllBeats(List<Weapon> beatWeapons)
public void addLoss(Weapon loseWeapon)
public void addAllLosses(List<Weapon> loseWeapons)
```

###Class: Player

* Represents each game player
* Will be able to determine which weapon it would like to throw
* Methods:
```java
public Weapon throw()
public int getScore()
```

###Class: Game
* The central game class
* Will have to have an initialization method(s) where it properly configures which weapons beat which other weapons
* Controls the GUI
* Methods:
```java
public void start();
```
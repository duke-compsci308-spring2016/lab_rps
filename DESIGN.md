CompSci 308 : RPS Design
===================

#### Authors: cmt57, mdf15, cft6, mmc56

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

Initial Design
=======

### public class Player()
* purpose: to represent a contestant in the RPS game who will have a weapon it will challenge another contestant with since a game cannot function without at least one player 
* the instance variables are:
  * Weapon currentWeapon
  * int score
* the methods are:
  * public Weapon selectWeapon(Weapon w)
    * purpose: set the currentWeapon status for the round and returns it 
  * public void updateScore()
	* purpose: increase score if player wins round
  *public int getScore()
    * purpose: returns the player's score
  * public void setScore(int i)
	* purpose: to change the player's score by a determined amount



### public class Main()
* purpose: processes data input so ready to be used in other classes / methods; also, initializes game with the 2+ players 
*the instance variables are:
  * Map<String,String> relationsMap
* the methods are:
  * public void readFile(File f)
    * purpose: organize inputted data into a map of relations 


### public class Weapon()
* purpose: holds information about its relationships to other weapons (what it can kill and what can kill it)
* the methods are:
  * public boolean canKill(Weapon enemy)
    * purpose: determines if this weapon will hold up against another
  * public boolean dead(Weapon enemy)
   * purpose: determines if will die against passed enemy


### public class Game(Map<String,String> relations, int win)
* purpose: processes player rounds and determines winners 
* the instance variables are:
	* Collection<Weapon> weapons;
	* int winCondition
* the methods are:
  * public void startGame()
  	* purpose: starts game by creating two players and runs rounds until the winning condition is met
  * public void round()
  	* purpose: allows each player to select a weapon, compares weapons, updates score based on outcome
  * public boolean gameOver()
  	* purpose: determines if either player's score meets the winning condition 


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


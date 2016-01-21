CompSci 308 : RPS Design
NetIDs: smk44, abz3, at200, rss44
===================

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

##Initial Design

### Main class
* instantiates instance of a game and launches the game
    
### Game class 
* constructor will load file and populate hash maps
* variables:
    * private Map\<String, Set\<String\>\> weaponBeats;
    * private Map\<String, Set\<String\>\> weaponLosesTo;
    * private User myUser;
    * private final AI myAI;
    * private Timer myTurnTimer;
* methods:
	* public void init(); call loadWeaponInfo, create player, create AI, prompt user for choice, scheduleTurnTimer
	* private void loadWeaponInfo(textfile text); parses text file with weapon info and populates the hashmaps weaponBeats and weaponLosesTo
	* private void createPlayers(); creates user object and AI object
	* public void updateAI(); update myAI's UsersPastMoves structure
	* scheduleTurnTimer(); schedules the turn timer, once timer expires have both players' choices show, then schedule new timer and prompt user for choice

### AI class
 	
	* private List<String> usersPastMoves;
	* chooseMove(); algorithm to choose weapon based on usersPastMoves
	* updateData(String move); updates data structure storing data regarding player's previous moves  

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
    public class Game {
	private final Player player1;
  private final Player player2;
  private boolean stillGame = true;
	Game(String name1, String name2) {
  	player1 = new Player();
    player2 = new Player();
    player1.setName(name1);
    player2.setName(name2);
    player1.setWins(0);
    player2.setWins(0);
    while (stillGame) {
    	playRound();
    }
  }
  
  private void playRound() {
  	// code code code 
    
  }
  
}
    }
```


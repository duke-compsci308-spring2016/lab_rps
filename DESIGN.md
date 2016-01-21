CompSci 308 : RPS Design
===================

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

Initial Design

Main class - instantiates instance of a game and launches the game
    
Game class - constructor will load file and populate hash maps
    private HashMap<String, Array<String>> weaponBeats;
    private HashMap<String, Array<String>> weaponLosesTo;
    private User myUser;
    private AI myAI;
    private Timer myTurnTimer;
	public void init(); call loadWeaponInfo, create player, create AI, prompt user for choice, scheduleTurnTimer
	    private void loadWeaponInfo(textfile text); parses text file with weapon info and populates the hashmaps weaponBeats and weaponLosesTo
	    private void createPlayers(); creates user object and AI object
	
	public void updateAI(); update myAI's UsersPastMoves structure
	scheduleTurnTimer(); schedules the turn timer, once timer expires have both players' choices show, then schedule new timer and prompt user for choice
	
AI class
    private ArrayList<String> UsersPastMoves;
    chooseMove(); algorithm to choose weapon based on UsersPastMoves
        

=======

###Class 1

* Bullets are made with asterisks

1. You can also order things with numbers


###Class 2



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


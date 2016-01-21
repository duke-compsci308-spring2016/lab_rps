CompSci 308 : RPS Design
===================

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

Initial Design
=======

###GameWorld
'''java
	private void loadUI()
	private void startGame()
 	private Map<Weapon, Collection<Weapon>> loadWeaponsData(File weaponData)
 	private void printAndUpdateResults(Player player1, Player player2) 
 	private void newRound()
	private void endGame()
	private void reset()
'''
* loadUI() is responsible for generating the user interface for the game.
* loadWeaponsData(File weaponData) is responsible for reading a file of weapons and creating a map with relationships between weapons in the form of a Map.
* startGame() is responsible for instantiating Players (setting their scores and other stats to zero).
* printAndUpdateResults(Player player1, Player player2) is responsible for displaying the results between two players and updating their scores.
* newRound() clears the weapon choices of players.
* endGame() stops the UI running.
* reset() reinitializes scores and weapon choices for players (restarts the game without closing the UI).


###Weapon
'''java
	public Weapon(String name, Collection<Weapon> listOfCanBeat)
	public int compareTo(Weapon other)
'''
* Weapon(String name, Collection<String> listOfCanBeat) is a constructor that initializes a weapon with a name and the list of other weapons it can beat.
* compareTo(String other) determines whether two weapons are the same or who beats who.

###Player
'''java
	public Player(int score, Weapon weaponChoice)
'''
* Player(int score, Weapon weaponChoice) is a constructor that initializes a weapon with a score and the weapon of choice.


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


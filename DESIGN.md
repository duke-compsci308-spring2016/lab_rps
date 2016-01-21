CompSci 308 : RPS Design
Team hpb3, can18
===================

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

Initial Design
=======

###Class 1 - MainMethod
* Has list of Games that have already started but are not active
* Read in file of weapons and populate map with available weapons
* Map key is the name of the weapon, the value is a collection of the weapon that the key beats
* Create a new games 
* Activate an old game
* End game



###Class 2 - Game
* Specific weapons for this game
* Keep track of the current score, possibly communicate with UI to update score display
* Have a playRound method that given the two choices of the player decides the winner
* Updates the score after every round, and recieves new choices from UI
* Give UI list of possible weapons and recieve players choice of weapon


##Class 3 - AllWeapons
* Store datastructure containing the list of weapons and which weapon beats which other weapons
* Methods to decide whether weapon a beats weapon b
* Add new weapons to the datastructure
* Remove weapons from the game



##Class 4 - Player
* Stores player score and player id
* Has method to update player score as well as reset the score




CRC Design
=======

###Class 1 - Main Method
* List<Game> allGames
* private void playGame(Game game)
* private void addGame(File file, Player player1, Player player2, File file)
* private void delGame(Game game)


###Class 2 - Game
* Player player1, player2
* boolean exitcondition //when to stop playing new rounds and quit the game
* private void updateScore(Player player1, Player player2, int score1, int score2)
* private int playRound(String weapon1, String weapon2) // returns 0 if tie, 1 if weapon1 wins, 2 if weapon2 wins
* private List getWeapons() //returns the list of keys from the Map of weapons
* private String getChoice(Player player1) //returns player choice as string
* private Map createMap(File file)
* Colloborates with the UI class

##Class 3 - AllWeapons
* Map weaponMap
* public void initiate(File file)
* public void addKey(String name, Collection values)
* public void addValue(String key, String value)
* public void delKey(String key)
* public void delValue(String key, String value)
* public int compareWeap(String key1, String key2)// returns 0 if tie, 1 if weapon1 wins, 2 if weapon2 wins

##Class 4 - Player
* int Score, id
* String name
* public void setScore(int score)
* public int getScore()

Use Cases
=======
* We ran out of time before getting to these.


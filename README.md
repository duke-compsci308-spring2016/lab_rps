# lab_rps
Duke CompSci 308 Lab : Design for the game Rock-Paper-Scissors

sj166, add36, agd19
Method Overview
============

Our implementation of the RPS-n game organizes combinations of weapons using a map of strings, one for each of the n options, mapped to a set of strings, made up of all of the options that the particular weapon defeats. 

There are three classes within our project- a RPS class that stores the game with all n weapon options, a player class which handles inputs, and a main class to act as an interface between the player and the game’s mechanics.

Users will select one weapon each, which will be stored as the player’s weapon attribute. RPS class will have methods that take in the players as inputs and determine the outcome of the game. The game play will be handled by first seeing if the two inputs are the same (report tie), then getting player 1’s move and seeing if it maps to player 2’s move (report win), then getting player 2’s move and seeing if it maps to player 1’s move (report win), and finally reporting a tie.

**RPS Class**

This is the main game handling class which stores the weapons in the map.
>Class RPS{

>private Map<String,Set<String>> optionsMap;
private 

>//Returns the different weapons available to the player
>//If optionsMap is not inititalized return null
>public List<String> getWeapons(){
>if (optionsMap==null) return null;}

This is the constructor for the class that would initialize the map and add values based on the *file of weapons given using readFile() method

>public RPS(String filename){
>}

Read the file using a Scanner and allocate the data to the map
*Each weapon is added as a key in the map and the weapons it destroys are added to the set, which is the value of the map. 
*A map and set are used because it is easier to retrieve the data associated with each weapon and ensure there are no repeats

>public readFile(String filename){}

>//This method takes in two players, checks their current weapons using getMove(), and determines the outcome of the game using optionsMap
>//The values of the two weaponsare compared 
>//If the inputs are the same, the value returned is "tie"
>//if the inputs are not the same, the hashmap is searched based on the input (key). If the >//hashset contains the other input, then this input wins.
>//Else the other input is checked.
>//The score of the winning player is incremented using incScore(); in the case of a tie, neither >//are updated
>//returns the winning player, or null if tie
>public Player play(Player input1, PLayerinput2){
>}

**Player Class**

This class handles player inputs and scores

>public class Player{

>private String myMove; //The player’s current move
>private int myScore = 0;;	  //The player’s score
>private String myName; 

Initializes player and sets name
>public Player(String name){
>}

Updates the player’s current move based on the input string next
>public void updateMove(String next){}
>}

Returns the current move based on user input via a button or console input
>public String getMove(){}

>//Increments the player’s score
>public void incScore(){}

>//Returns the player’s name
>public String getName(){}

>}


**GamePlay Class**

The GamePlay class handles starting the game, taking in weapon inputs to assign to players, and displays the result.
>public class GamePlay{
	
>private Player p1 = new Player();
>private Player p2 = new Player(); 
>private RPS myRPS = new RPS(“filename.txt”);
	
This method listens for actions as players make their moves, and update p1 and p2 using moves
>public void listen(){}

The main method initializes players and RPS instances and begins the initialization process for the RPS class
*reads the file
*listens for actions in a loop and calls RPS.play() after registering that both players have made moves
*Displays name of the player returned by RPS.play() to users using the getName() method of *the winning player
>public static void main(String[] args){
	
>}

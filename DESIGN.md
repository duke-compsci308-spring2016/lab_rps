CompSci 308 : RPS Design
===================

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

Initial Design
=======

###GameLoader Class

* This class will include the necessary code to read from the file storage system.
```java
	public static void readFile(file input){...}
```
* This method above will instantiate a RPSGameClass and enough RPSActions placed into a Java Collection to fully describe the rules of the game
* The above method will call various helper methods to accomplish this end
```java
	public static RPSAction createGameRule(String ruleName, List<String> rulesBeatByThisRule){...}
	public static RPSGame init(List<RPSAction> listOfGameRules){...} //this method from RPSGame
```

* This will allow game logic to be isolated from input output functions.






###RPSGame
* Will contain a list of strings to store the outcome of games
* Will contain a method that takes in two actions and checks with the corresponding action classes in order to figure out the result of the game
* This method will search the hashmaps to find the corresponding RPSAction classes in order to call the doesBeat methods on them, to determine the outcome of the game.
* The output string will be stored in another list of strings to store game outcomes and print them, could create a gameOutcome class if needed
```java
	private HashMap<String, RPSAction> mapOfStringsToRules;
	private List<String> listOfGameOutComes;
	public String runGame(String playerOneChoice, String playerTwoChoice){...}

```

* A method that will iterate through the exiting rules and update the list of things that they can beat in order to allow for the addition of new rules
```java
	public void addNewRule(RPSAction newRule, Collection<String> rulesThatBeatThisRule){
	...
	for(String s : rulesThatBeatThisRule){
		RPSAction temp = mapOfStringsToRules.get(s);
		temp.addRuleCanBeat(newRule.getRuleName);
	}
	...
	
```


###RPSAction
* Each instance of this class will have a variable that can be used to identify which action it is (ie. rock, paper etc...) which will be set upon creation of rule
*Each instance will also track which other rules it beats, this and the above demonstrated by the below constructor
```java
 public RPSAction(String ruleName, List<String> rulesBeatByThisRule){...}
```
* A public method that will examine an input action and return whether or not this instance of the ActionClass beat the other input action
```java
	public boolean doesBeat(RPSAction actionToCheck){...}
```
* A public method to allow for the addition of things that the rule can beat

```java
	public void addRuleCanBeat(String newRuleName){...}
```
* Consequently the RPSAction class must maintain a data structure that lists the other beatable actions
```java
	private HashSet<String> setOfBeatableActions = new HashSet<String>();
```
###GUI
* Will create a GUI and allow for user input
* Will report the results of games as calculated by RPS Game Class



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


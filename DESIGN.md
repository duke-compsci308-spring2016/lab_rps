CompSci 308 : RPS Design
===================

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

Initial Design
=======

###**Class 1: Hierarchy**

Defines which weapon will beat which other 
1. *public void update(String weapon, Map of String and int)* - adds into the overall map the new weapon and its results with everyone else

2. *public int getResult(String opponent, String opponent2)* - returns win (1) loss(-1) or tie(0) of the first playing the second

3. *public void remove(String weapon)* - removes a given weapon from the hierarchy

4. Map of Maps to store information about who beats what


###**Class 2: Game** 



1. Constants for all types already established

2. List of Strings for all weapons

3. *public String computersWeapon()* - generate random weapon for the computer to use (easily swapped out for better algorithm)

4. *public static void Main()* - offer to input new weapons / remove weapons,  use GUI to get player's(s) weapon(s), if only one player call computersWeapon() to select a weapon, calls getResults to find winner, updates scores output's results



###**Class 3: Input/Output**

1. *public String getUserWeapon()* - gets a user's weapon

2. *public void output()* - returns result to the user 

3. *public void updateScores(int[] changes to scores)* - shows the current score of all players

4. *public getNewWeapon()* - gathers the weapons name and win/loss result from user input, updates Hierarchy

5. *public void removeWeapon()* - receives name of weapon to be removed from the user and removes it from the Hierarchy
Check to ensure weapons ect valid

6. *public void initialize()* - gets number of players that will be playing and updates an array of their scores

7. Integer[] of all players and their current scores



CRC Design
=======

###Class 1


###Class 2

You can add images as well:

![This is cool, too bad you can't see it](crc-example.png "Our CRC cards")


Use Cases
=======
1. 
	Main() 
	io = new InputOutput;
	io.initialize();
	io.updateScores([0, 0]);
	
2. io.getUsersWeapon();

3.
	int result = Hierarchy.getResult(weapon1, weapon2);
	int[2] updates;
	if(result == 0){ updates = [0,0];}
	else if (result == -1) { updates = [0, 1];}
	else if (result == 1) { updates = [1, 0];}
	io.updateScores(update);
	
4.
	io.getNewWeapon()
	hierarchy.update(String name, Map of weapon results);
	
5. 
	for( weapons: newGame.getWeapons() ){
			hierarchy.update(weapons, newGame.getResults(weapons));
	}
	
	

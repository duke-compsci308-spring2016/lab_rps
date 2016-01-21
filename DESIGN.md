CompSci 308 : RPS Design 
By: David Yan (dwy3) and Srikar Pyda (sp285)
===================

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

Lab_RPS (CS308 1.21.16)
-------------
High Level Class Overview:
Public methods (parameters & return value)
> **Comparator Class:**
> - Takes in both player's selection
> - Assumes every single hand has to be an object
> - The Comparator class takes in two objects, and decides the winner based on the relative value between the two objects through some sort of algorithm. This class will have the compareTo class that will compare the objects accordingly.


---------------------

> **Game Class:**
> - Game class generates screen to fit into generate scene method.
> - Generate scene method:
> - Takes in current state that we are in 
> - Begins with splash state
> - Calls method to call next state
> - Loads next state 
> - (choosing state)
> - After choosing state, game decides who won and displays win screen

---------------------

> **Object Class:**
> - OO for selecting the move name property. This class has a move method that returns the move name selected.


---------------------


> **Object Class:**
> - Move 1: A new game is started with two players, their scores are reset to 0.
	- Class: Game class
	- Method: Generate Scene method
> - Move 2: A player chooses his RPS "weapon" with which he wants to play for this round.
	- Class: Game Class
	- Method: Choose Method
> - Move 3: Given two players' choices, one player wins the round, and their scores are updated.
	- Class: Game class
	- Method:  Update Score Method
> - Move 4: A new choice is added to an existing game and its relationship to all the other choices is updated.
	- Class: Object Class
	- Method: Add Choice method
> - Move 5: A new game is added to the system, with its own relationships for its all its "weapons".
	- Class: Game Class
	- Method: Generate Scene method


---------------------




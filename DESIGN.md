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
Takes in both player's selection
Assumes every single hand has to be an object
the Comparator class takes in two objects, and decides the winner based on the relative value between the two objects through some sort of algorithm. This class will have the compareTo class that will compare the objects accordingly.


---------------------

> **Game Class:**
Game class generates screen to fit into generate scene method.
Generate scene method:
takes in current state that we are in 
begins with splash state
calls method to call next state
loads next state 
(choosing state)
after choosing state
game decides who won
displays win screen

---------------------

> **Object Class:**
OO for selecting the move
name property. This class has a move method that returns the move name selected.


---------------------


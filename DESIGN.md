cg173, myk3, vc54

CompSci 308 : RPS Design
===================

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

Initial Design
=======

###Class 1 (Weapon Input)

* Input weapons. Must have an odd number of weapons

###Class 2 (Battle Chart Making)
1. Takes the input of weapons and uses math. The weapon beats the next (n-1)/2 weapons inputted weapons (such as the chart given in class)
2. Changes the ordering of the list of weapons and then uses the same method in the first answer.
* These methods will require the use of a map so that each weapon points to the other weapons it can win against but also lose against

### Class 3 (Actual Battle) Methods
1. Create a history (map) of all past moves made for other reference.
2. Store history (in queue) of last 5 or so moves which will also bear weight on the next decision.
3. Method to read and weight the histories to make the ultimate decision (by probabilities) to win.
4. Read the probabilities for each move and then make a random decision weighted by these percentages to win forever. 80% the dream.

CRC Design
=======

![enter image description here](https://lh3.googleusercontent.com/-DZuFs0iHN4w/VqFedGxXL7I/AAAAAAAAAVE/VTAlk5l40YM/s0/IMG_1912.JPG.jpeg "IMG_1912.JPG.jpeg")

:ram:

Use Cases
=======

You can put blocks of code in here like this:
```java
1. void resetGame(){
	int PlayerOneScore = 0;
	int PlayerTwoScore = 0;
   }
   
2. Queue lastFiveMoves(String, lastMove){
	

}

3. void updateTurnNumber()
	update Turn Number
	void updateRecord(String winLose)
	Either PlayerOneScore or PlayerTwoScore + 1
	update the scores of the players

4. updateWeaponWheel(String weapon, Set beatsThis)
	update the weapon wheel with the new

5. Map updateGameMode(Set weapons, Map relations)
	update the GameMode
```

*an outside source looked at our CRC cards and said they could make use of these methods

/play trololo

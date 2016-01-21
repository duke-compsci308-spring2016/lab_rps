CompSci 308 : RPS Design
===================

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

#Class one
WeaponSystem- holds the database of weapon relations, compares 2 weapons against eachother, updates the database to allow for enw weapons
###Methods

Makemap- pass in file, return map containing how weaons relate to eachother

update-accepts text, appends file, and makes new map of weapon relations

isBeaten-accepts two strings that are weapon names, returns a boolean to see which weapon beats which using the makeMap method

#Class 2
Player Class
identifies player, allowes weapon choice, keeps score

has properties payerid score, and weapon

###Methods
Chooseweapon-prompts the player to choose a weapon

#Class 3
Game 
Executes the game,
Start(asks player for id and file to pass into weapons system class), returns nothing

GameLoop-
asks the player to choose weapon from Player class
sees which player won, increments score

```java
package lab_rps;

public class Player {
	private String id;
	private int score;
	private String weopon;
	public Player(String id) {
		this.id = id;
	}
	public void chooseWeapon() {
		//prompts to choose
		String weapon = ""; //this has whatever was user input
		this.weopon = weapon;
	}
	
}
```
```java
package lab_rps;

import java.util.HashMap;
import java.util.List;

public class WeaponSystem {
	HashMap<String, List<String>> map;
	List<String> fileTxt;
	public WeaponSystem(String txt) {
			//do some file input stuff
			//parseStuff
			//call makeMap
			//put stuff in file too
	}
	public boolean isBeaten(String a, String b) {
		return map.get(a).contains(b);
	}
	public void makeMap(String txt) {
		//parse file
		//put in map
	}
	public void update(String txt) {
		//adds stuff from new file to fileText
		
	}
}
```
```java
package lab_rps;

import java.util.*;

public class rpsGame {
	public static void main(String args[]) {
		rpsGame r = new rpsGame();
		r.start();
		Player a = new Player("id1");
		Player b = new Player("id2");
		WeaponSystem w = new WeaponSystem("");
		while(true) {
			a.chooseWeapon();
			b.chooseWeapon();
			if(!a.weapon.equals(b.weapon)){
				w.isBeaten(a.weapon, b.weapon);
				//choose if to continue
				//add scores...
			}
			
		}
	}
	private void start() {
		//call player to enter id
		//choose list of weapons which is passed to weopons system
	}
}
```
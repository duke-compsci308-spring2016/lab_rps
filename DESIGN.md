CompSci 308 : RPS Design
===================

* Timothy Blumberg
* Madhav Kumar
* Shae von Wagoner
tsb20, mrk33, csv5

> This is the link to the Lab Description:
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

# Class List

# Weapon
  This class stores each Weapon's unique identifier

### Data
  * `private int index; // must be unique`
  * `private String name;`

### Methods
  * `public int getIndex();`
  * `public String getName();`

# WeaponManager
  Coordinates the relationships between Weapons

### Data
  * `private final Matrix<boolean> relationships;`

### Methods
  * `public boolean score(Weapon w1, Weapon w2);`
  * `public int getNumWeapons();`
  * `public List<Weapon> getWeaponList();`

# Main
  Provide overarching program structure, connecting all the little pieces

### Methods
 * `public void startGame();`

# Player
Manages individual player actions

### Data
  * `private Weapon activeWeapon;`
  * `private int score;`

### Methods
  * `public Weapon getActiveWeapon;`
  * `public void setActiveWeapon;`
  * `public int getScore;`
  * `public void setScore;`


# Data Description

Store Weapon relationships as 2x2 integer matrix. The coordinates of values will be indexed by `(Player A's Weapon, Player B's Weapon)` matrix will be setup such that values in the table will be from the perspective of `Player A`.

Weapons will need to be individually indexed such that they have a unique row/colum position to be found


# Use Cases

## New Game is started
* Loop
  * Players select Weapons
  * score(p1.getWeapon(), p2.getWeapon())
  * players update scores

## Chooses Weapons
* player.setWeapons(w1);

## Players confront each other
* if player 1's weapons beats player 2's
  * score player 1
* else
  * score player 2

## New weapons
* Add new rows and columns to WeaponManager matrix based on input file

## New Game is added with different weapons
* Create new WeaponManager for this new Game
* Reset player scores
* Prompt new Weapons choices from players. 

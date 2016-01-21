CompSci 308 : RPS Design
===================

> This is the link to the Lab Description:
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

Initial Design
=======

# Class List

* ## Weapon
  This class stores each Weapon's unique identifier
  * ### Data
    * `private int index; // must be unique`
  * ### Methods
    * `public int getIndex();`
* ## WeaponManager
  Coordinates the relationships between Weapons
  * ### Data
    * private final Matrix<boolean> relationships;
  * ### Methods
    * public boolean score(Weapon w1, Weapon w2);
* ## Main
  Provide overarching program structure, connecting all the little pieces



## Data Description

Store Weapon relationships as 2x2 integer matrix. The coordinates of values will be indexed by `(Player A's Weapon, Player B's Weapon)` matrix will be setup such that values in the table will be from the perspective of `Player A`.

Weapons will need to be individually indexed such that they have a unique row/colum position to be found

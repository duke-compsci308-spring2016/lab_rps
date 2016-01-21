CompSci 308 : RPS Design
===================

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

Initial Design
=======

###Class 1: Game

* Contains Player and WeaponList objects

* Contains methods that:

1. Reads an input file that includes a list of weapons and what each beats

2. Initializes players by creating a new instance of Player class

3. Starts a new game between two players

4. Allows players to choose their weapon, which is stored in that Player's player.weapon

5. Plays a round between two players by checking the players' weapon matchup in a WeaponList outcome matrix and increments the winner's score


###Class 2: Player

* Contains the name, score, and weapon choice of a player

* Contains methods that:

1. Resets the score of the player

2. Increments the score of the player

3. Sets the weapon the player will use


###Class 3: WeaponList

* Contains a list of weapons and an outcome matrix of all the different pairings of weapons

* Contains methods that:

1. Adds a new weapon to the list of weapons and updates the outcome matrix based on a set of the weapons it beats


CRC Design
=======

###Class 1: Game

* Player player1

* Player player2

* WeaponList wl


* newGame() -> returns void

* initializePlayer(String name) ->returns Player

* readFile(File f) -> returns WeaponList

* playRoundAndUpdateScore(Player player1, Player player2) -> returns void

* chooseWeapon(Player player) -> returns void


###Class 2: Player

* String name

* int score

* String weapon



* resetScore() -> returns void

* incrementScore() -> returns void

* setWeapon(String w) -> returns void


###Class 3: WeaponList

* ArrayList<String> weapons

* ArrayList<ArrayList<Integer>> outcomeMatrix


* addWeapon(string Weapon, Set<String> thingsItBeats) -> returns void


=======
To create a new player:

```java
    public void initializePlayer(String name) {
        Player player1 = new Player();
        player1.name = name;
        player1.score = 0;
        return;
```

To add weapon and update relationships:
```java
    addWeapon(string newWeapon, Set<String> thingsItBeats) {
        weapons.add(newWeapon);
        outcomeMatrix.add(new ArrayList<Integer>);
        for (int i = 0; i < weapons.size(); i++) {
            if thingsItBeats.contains(weapons.get(i)) {
                outcomeMatrix.get(outcomeMatrix.size()-1]).get(i) = 1;
                outcomeMatrix.get(i).add(-1);
            }
            else {
                outcomeMatrix.get(outcomeMatrix.size()-1]).get(i) = -1;
                outcomeMatrix.get(i).add(1);
            }
        }
    }
```


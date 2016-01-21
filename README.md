**lab_rps**
===================

akt16, dm269, aaa53
Annie Tang, Jonathan Ma, Aamir Azhar

**Cases:**
- A new game is started with two players, their scores are reset to 0.
>readGame("datafile1");
>Player A = new Player();
>Player B = new Player();
>A.setScore(0);
>B.setScore(0);

- A player chooses his RPS "weapon" with which he wants to play for this round.
>A.getPlayerWeapon();

- Given two players' choices, one player wins the round, and their scores are updated.
>if(getWinner(A, B) == 1){
>	A.setScore(A.getScore() + 1);
>}
>else if(getWinner(A, B) == -1){
>	B.setScore(B.getScore() + 1);
>}

- A new choice is added to an existing game and its relationship to all the other choices is updated.
>readNewWeapon();
- A new game is added to the system, with its own relationships for its all its "weapons".
>readGame("datafile2"); 



Classes
-------------

MainRPS 
> **public void readGame(String textfile)**
> Input: new game data added to system
> Output: void
> Can read in new game here and turn each weapon & relationship within this game to Weapon objects,
>  
> **public int getWinner**
> Input: two players; ex: getWinner(A,B)
> Output: 1/-1/0, where 1 means A wins, -1 means B wins, 0 is tie.
> calls compareTo method on weapons of player A and B
> two weapons, from getPlayerWeapon
>
>**public void readNewWeapon**
>Input: new weapon choice data
>Output: none, just creates a Weapon option 

Weapon
> **Input:** interactions 
> **Output:** usable Weapon object 
> 
>**public void init**
> Input: interactions
> Output: no return, but creates collection structure
> method to create collection structure from interactions (possibly ArrayList of ArrayLists, i.e. matrix implementation)
> 
>**public int compareTo** 
> Input: "this" and another weapon
> Output: returns 1/-1 based on which weapon wins, 0 is tie 

Player
> **Input:** none, i.e. Player A = new Player(); 
> **Output:** a player
> 
> **public int getScore**
> Input: none
> Output: score of player
> 
> **public Weapon getPlayerWeapon**
> Input: no parameters
> Output: player's choice of weapon, is stored in Player class 
> user input here 
> 
>**public void setScore**
>Input: int 
>Output: void 



**lab_rps**
===================

akt16, dm269, aaa53
Annie Tang, Jonathan Ma, Aamir Azhar

**Cases:**
- A new game is started with two players, their scores are reset to 0.
- A player chooses his RPS "weapon" with which he wants to play for this round.
- Given two players' choices, one player wins the round, and their scores are updated.
- A new choice is added to an existing game and its relationship to all the other choices is updated.
- A new game is added to the system, with its own relationships for its all its "weapons".



Classes
-------------

MainRPS 
> **public void readGame**
> Input: new game data added to system
> Output: void
> Can read in new game here and turn each weapon & relationship within this game to Weapon objects,
>  
> **public int getWinner**
> Input: two players
> Output: 1/0
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
> Output: returns 1/0 based on which weapon wins 

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
> Output: player's choice of weapon
> user input here 
> 
>**public void setScore**
>Input: int 
>Output: void 



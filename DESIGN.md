CompSci 308 : RPS Design
===================

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)
atw15, fxw, rk145
Austin Wu, Frank Wang, Raghav Kedia
Initial Design
=======

###Game Class

*Instance Variables
**Player player1
**Player player2
**ArrayList<Weapon> weaponlist 
**int numberOfRounds rounds
*Methods
**void playRound()

###Weapon Class
*Variables
**String name
*Methods
**String getName()
**void setName(String s)
**Collection<String> getBeatable()
**void setBeatable(Collection<String> list)
**void addBeatable(String s)
**int compare(Weapon otherweapon)

###Player Class
*Variables
**String name
**Weapon weapon
**int wins, losses
*Methods
**String getName()
**void setName(String s)
**int getWins()
**void setWins(int n)
**int getLosses()
**void setLosses(int n)
**void setWeapon(Collection<Weapon> weaponList)
**Weapon getWeapon()

CRC Design
=======
We wrote usecases for the team of abz3's team's cards.

###Game
*Variables
**private Map<String, Set<String>>weaponBeats;
**private User myUser;
**private final AI myAI;
**private Timer myTurnTimer;
*Methods
**public void init()
**private void loadWeaponInfo(textfile text)
**private void createPlayers()
**public void updateAI()
**private void scheduleTurnTimer()

###Main
*Methods
**public void start()

###AI 
*Methods
**public void chaseMove();
**public void updateData(String move);

You can add images as well:

![This is cool, too bad you can't see it](crc-example.png "Our CRC cards")


Use Cases
=======
Use Case #1
```
start(){
	Game newGame = new Game();
	newGame.init();
	newGame.createPlayers();
	newGame.resetScores();
}
```
Use Case #2
```
public void chooseWeapon(User user){
	User.setWeapon(weaponBeats);
}
```

Use Case #3
```
public User compareChoices(User p1, User p2){
	if (weaponBeats.get(p1.getWeapon()).equals(weaponBeats.get(p2.getWeapon())){
		return p1;
	}
	if (weaponBeats.get(p2.getWeapon()).equals(weaponBeats.get(p1.getWeapon())){
		return p2;
	}
	return null;
}
```
Use Case #4
```
public void addChoice(String weapon, Set<String> relationships){
	updateAll();
}
```

Use Case #5
```
public Game addNewGame(textfile weaponinfo){
	Game newGame = new Game();
	newGame.init();
	newGame.createPlayers();
	newGame.resetScores();
	newGame.loadWeaponInfo(weaponinfo);
}
```

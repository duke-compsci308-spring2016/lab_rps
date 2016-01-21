RCP
===================



Class 1 - Main
----------
Implements the game


Class 2 - Relationship
----------
private Map<Object> relation

public void readData(Collection<String> data)
public int beat(Object o1, Object o2): check if o1 beats o2
public void addWeapon( Collection<Object> Object A, Object O, Collection<Object> B): add a new weapon O that gets beaten by A and beats B


Class 3 - Players
----------
private double scores
private String weapon
private String name

public double getScore()
public void setScore()
public Object getWeapon()
public void changeWeapon(Object o)


Class 4 - PRSGame
----------
private Relationship myRelationship
private Players p1,p2

public void init() //initialize the game 
public void round() 
public void end()
public Player getWinner()
public void restart()


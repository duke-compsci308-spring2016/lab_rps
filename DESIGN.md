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

###Class 1


###Class 2

You can add images as well:

![This is cool, too bad you can't see it](crc-example.png "Our CRC cards")


Use Cases
=======

You can put blocks of code in here like this:
```java
    public int getTotal (Collection<Integer> data) {
        int total = 0;
        for (int d : data) {
            total += d;
        }
        return total;
    }
```


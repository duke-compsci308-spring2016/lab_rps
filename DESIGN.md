CompSci 308 : RPS Design
===================

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

CRC Design
=======

###Weapon

* Defined by the name (ie. "Rock")

####Responsibilities

* To keep track of what weapons beat this one

* To keep track of what weapons this one beats

####Attributes

* String myName

* Set<Weapon> beatsMe

* Set<Weapon> iBeatThem

###Game

####Attributes

* Player player1

* Player player2

###Round

####Responsibilities

* Keep track of weapons chosen by both players

* Determine a winner for the round

####Atributes

* Weapon player1Weapon

* Weapon player2Weapon

####Methods

* Need to determine if both weapons selected

* Need to determine winner


<!-- 

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

 -->
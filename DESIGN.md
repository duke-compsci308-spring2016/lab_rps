CompSci 308 : RPS Design
===================

NetIDs: bl131, ah335, cw223

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

Initial Design
=======

### Element Class 

* Contains element's name (or some ID to distinguish it from others)

### Resource Loader

* public Map<Element, Collection<Element>> loadFile(File f) 

> Reads file and populates a map. Data structure is a map of collections. Each key corresponds to an element and points to a collection of elements that it defeats. 

### Player Class 

* private int playerName;

* private int playerScore;

* public String getName() returns playerName

* public int getScore() returns playerScore

### Gameplay Class  

* public void chooseElements(Element elem1, Element elem2) 

> Asks for inputs from user. Takes player inputs from User Interface (selected elements) 

* public void play() 

> Calls receiveInputs and then compare() with those inputs. 

* public int compare() 

> Returns -1, 0 , 1 to correspond to losses, draws, and wins. If the first element's list contains the other, and the other's list doesn't contain the first, the first element wins. The opposite applies to losses. If both elements contain the other or both elements don't contain the other, then a draw (0) is returned. 

CRC Design
=======

### Element Class 

* Contains element's name (or some ID to distinguish it from others)

### Resource Loader

Collaborators: Element

* public Map<Element, Collection<Element>> loadFile(File f) - Reads file and populates a map. Data structure is a map of collections. Each key corresponds to an element and points to a collection of elements that it defeats. 

* public void addElement(Element e, Collection<Element>) - Adds in a new Element and a Collection of Elements it defeats

### Player Class 

Collaborators: Gameplay, Element

* private int playerName; 

* private int playerScore;

* public String getName() returns playerName

* public void incrementScore() increases player's score by 1

* public int getScore() returns playerScore 

* public void setScore(int score) 

* public Element pickElement() - returns chosen Element, called by the Gameplay class 

### Gameplay Class  

Collaborators: Player, Element

* private Player player1, player2 - keeps track of who is playing the game

* public void playGame() - Calls player1.pickElement() and player2.pickElement() and then compare() with those inputs. 

* public void updateScore(Player player) - calls incrementScore() for player who won

* public int compare() - Returns -1, 0 , 1 to correspond to losses, draws, and wins. If the first element's list contains the other, and the other's list doesn't contain the first, the first element wins. The opposite applies to losses. If both elements contain the other or both elements don't contain the other, then a draw (0) is returned. 

* public void reset() - sets both player's scores to 0 by calling player.setScore(0) for each player

Use Cases
=======

### Name: A new game is started, reset scores to 0

	public class Gameplay{
		private Player player1, player2;
	
		public void reset() {
			player1.setScore(0);
			player2.setScore(0);
		}
	}

	public class Player{
		private myScore;
	
		public void setScore(int score) {
			this.myScore = score;
		}
	
	}


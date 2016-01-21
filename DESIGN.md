CompSci 308 : RPS Design
===================

> This is the link to the Lab Description: 
[Lab - RPS](http://www.cs.duke.edu/courses/compsci308/spring16/classwork/02_design_rps/index.php)

Initial Design
=======

###Class 1 - Game Class

* HashMap of Strings to HashSet<String>
	- loseSet.get(choice) returns a HashSet of Strings that represent the RPS weapons that this choice beats.

* getWinner() Method that takes in 2 Strings that represent choices
	- if statements use HashMap to check if String choice1 occurs in map.get(choice2) or vice versa
	- returns a String for which RPS Choice wins or blank String if they tie

* Constructor takes in HashMap of Strings to HashSet<String>

* begin() method 
	- Prompts user for two Strings
	- uses HashMap to find RPS Choice objects
	- checks which RPS Choice object wins using getWinner()
	- loops


###Class 2 - Main Class

* Main method 
	- reads in stuff from file 
	- creates the RPS Choice objects and adds to HashMap (Should map Strings to HashSet<String>)
	- initializes new instance of Game Class with HashMap
	- game.begin() starts the game loop






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
    public class Main{
    	public static void main(String [] args){
    		Scanner in = new Scanner(new File("gameFile.txt"));
    		HashMap<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();
    		while(in.hasNextLine()){
    			HashSet<String> set = new HashSet<String>();
    			String line = in.nextLine();
    			String[] data = line.split("\\s+");
    			for(int i = 1;i < data.length;i++){
    				set.add(data[i]);
    			}
    			map.put(data[0], set);
    		}
    		Game g = new Game(map);
    		g.begin();
    	}
	}
	public class Game{
		private HashMap<String, HashSet<String>> loseSet;
		private String getWinner(String choice1, String choice2){
			if(choice1.equals(choice2)){
				return "";
			}
			else if(loseSet.get(choice1).contains(choice2)){
				return choice1;
			}
			else if(loseSet.get(choice2).contains(choice1)){
				return choice2;
			}
			return "";
		}
		public Game(HashMap<String, HashSet<String>> l){
			loseSet = l;
		}
		public void begin(){
			while(1){
				System.out.println("Enter 2 choices");
				Scanner in = new Scanner(System.in);
				String c1 = in.next();
				String c2 = in.next();
				if(!getWinner(c1, c2).equals("")){
					System.out.println(getWinner(c1, c2));
				}
				else{
					System.out.println("Tie");
				}
			}
		}

	}
```





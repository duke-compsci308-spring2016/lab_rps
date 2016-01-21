package lab_rps;

public class Player {
	private String id;
	private int score;
	private String weopon;
	public Player(String id) {
		this.id = id;
	}
	public void chooseWeapon() {
		//prompts to choose
		String weapon = ""; //this has whatever was user input
		this.weopon = weapon;
	}
	
}

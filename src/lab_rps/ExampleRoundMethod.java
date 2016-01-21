package lab_rps;

public class ExampleRoundMethod {
	public void round(){
		Weapon p1Weapon = player1.selectWeapon();
		Weapon p2Weapon = player2.selectWeapon();
		if(!p1Weapon.getName().equals(p2Weapon.getName())){
			if(p1Weapon.canKill(p2Weapon){
				player1.updateScore();
			}
			else{
				player2.updateScore();
			}
		}
	}
}

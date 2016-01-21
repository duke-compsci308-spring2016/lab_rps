package lab_rps;

import java.util.*;

public class rpsGame {
	public static void main(String args[]) {
		rpsGame r = new rpsGame();
		r.start();
		Player a = new Player("id1");
		Player b = new Player("id2");
		WeaponSystem w = new WeaponSystem("");
		while(true) {
			a.chooseWeapon();
			b.chooseWeapon();
			if(!a.weapon.equals(b.weapon)){
				w.isBeaten(a.weapon, b.weapon);
				//choose if to continue
				//add scores...
			}
			
		}
	}
	private void start() {
		//call player to enter id
		//choose list of weapons which is passed to weopons system
	}
}

package lab_rps;

import java.util.HashMap;
import java.util.List;

public class WeaponSystem {
	HashMap<String, List<String>> map;
	List<String> fileTxt;
	public WeaponSystem(String txt) {
			//do some file input stuff
			//parseStuff
			//call makeMap
			//put stuff in file too
	}
	public boolean isBeaten(String a, String b) {
		return map.get(a).contains(b);
	}
	public void makeMap(String txt) {
		//parse file
		//put in map
	}
	public void update(String txt) {
		//adds stuff from new file to fileText
		
	}
}

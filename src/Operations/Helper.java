package Operations;

import Model.Computer;

public class Helper {
	public static void addRAM(Computer c1, int RAMToAdd) {
		c1.setRAM(c1.getRAM() + RAMToAdd);
	}
	
	public static void substractRAM(Computer c1, int RAMToSubstract) {
		c1.setRAM(c1.getRAM() - RAMToSubstract);
	}
}

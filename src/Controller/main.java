package Controller;

import Model.Computer;
import Operations.Helper;

public class main {

	public static void main(String[] args) {
		Computer c1 = new Computer("Nvidia GTX 2080Ti",16,"Intel i7","MSI",2048);
		System.out.println(c1.toString());
		System.out.println("A�ado ram");
		Helper.addRAM(c1, 16);
		Helper.addRAM(c1, 16);
		System.out.println(c1.toString());
		System.out.println("Reduzco ram");
		Helper.substractRAM(c1, 16);
		System.out.println(c1.toString());
		System.out.println("Reduzco ram");
		Helper.substractRAM(c1, 16);
		System.out.println(c1.toString());
	}

}

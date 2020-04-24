package Model;

public class Computer {
	private String GPU;
	private int RAM;
	private String CPU;
	private String motherBoard;
	private int hddCapacity;

	public Computer() {
		super();
	}

	public Computer(String gPU, int rAM, String cPU, String motherBoard, int hddCapacity) {
		super();
		GPU = gPU;
		RAM = rAM;
		CPU = cPU;
		this.motherBoard = motherBoard;
		this.hddCapacity = hddCapacity;
	}

	public String getGPU() {
		return GPU;
	}

	public void setGPU(String gPU) {
		GPU = gPU;
	}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}

	public String getCPU() {
		return CPU;
	}

	public void setCPU(String cPU) {
		CPU = cPU;
	}

	public String getMotherBoard() {
		return motherBoard;
	}

	public void setMotherBoard(String motherBoard) {
		this.motherBoard = motherBoard;
	}

	public int getHddCapacity() {
		return hddCapacity;
	}

	public void setHddCapacity(int hddCapacity) {
		this.hddCapacity = hddCapacity;
	}

	@Override
	public String toString() {
		return "Computer [GPU=" + GPU + ", RAM=" + RAM + ", CPU=" + CPU + ", motherBoard=" + motherBoard
				+ ", hddCapacity=" + hddCapacity + "]";
	}

}

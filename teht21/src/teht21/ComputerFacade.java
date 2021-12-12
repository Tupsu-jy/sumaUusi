package teht21;

public class ComputerFacade {

	private CPU cpu_;
	private  Memory memory_;
	private  HardDrive hard_drive_;

	public ComputerFacade() {
		cpu_ = new CPU();
		memory_ = new Memory();
		hard_drive_ = new HardDrive();
		cpu_.setMem(memory_);;
		System.out.println("Kone luotu");
	}

	public void Start() {
		int kBootAddress = 42;
		int kBootSector = 2;
		int kSectorSize = 512;
		cpu_.Freeze(); // lol
		memory_.Load(kBootAddress, hard_drive_.Read(kBootSector, kSectorSize));
		System.out.println("Boottibitit ladattu muistiin");
		cpu_.Jump(kBootAddress);
		System.out.println("Pointteri siirretty");
		cpu_.Execute();
		System.out.println();
		System.out.println("Ohjelma suoritettu");
	}


}

package teht21;

public class CPU {
	
	private Memory mem;
	int pointer;
	
	  void Freeze() {
		  //???
	}
	  
	  void Jump(int position) {
		  pointer = position;
	}
	  
	  void Execute() {
		  int[] ram = mem.getRam();
		  for (int i = pointer; i < ram.length; i++) {
			System.out.print(ram[i]);
		}
	}

	public Memory getMem() {
		return mem;
	}

	public void setMem(Memory mem) {
		this.mem = mem;
	}
}

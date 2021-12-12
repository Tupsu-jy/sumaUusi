package teht21;

public class HardDrive {
	
	private String[] stuffOnDrive;
	
	public HardDrive() {
		stuffOnDrive = new String[15];
		String[] bit = new String[] {"0", "1"};
		
		for (int i = 0; i < stuffOnDrive.length; i++) {
			String dataSector = "";
			for (int j = 0; j < 5000; j++) {
				String newBit = bit[Math.random() > 0.5 ? 0: 1];
				dataSector = dataSector.concat(newBit);
			}
			stuffOnDrive[i] = dataSector;
		}	
	}
	
	public String Read(int lba, int size) {
		if(size<5000 && size>0) {
			return stuffOnDrive[lba].substring(0, size);
		}else {
			return stuffOnDrive[lba];
		}
		
	}
	
}

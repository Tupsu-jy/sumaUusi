package teht21;

public class Memory {

	private int[] ram;
	
	public void Load(int position, String data) {
		ram = new int[data.length()-position];
		for (int i = 0; i < data.length()-position; i++) {
			ram[i] = Character.getNumericValue(data.charAt(i+position));
		}
	}
	
	public int[] getRam() {
		return ram;
	}
}
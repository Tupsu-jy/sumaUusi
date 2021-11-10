package teht6;

public class Encrypter implements WritingIF {

	private WritingIF component;
	
	public Encrypter(WritingIF component) {
		this.component = component;
	}
	
	@Override
	public void write(String input) {
		char[] result = input.toCharArray();
		for (int i = 0; i < result.length; i++) {
		    result[i] += 5;
		}
		String destString = new String(result);
		
		component.write(destString);
	}

	@Override
	public String read() {
		String output = component.read();
		
		char[] result = output.toCharArray();
		for (int i = 0; i < result.length; i++) {
		    result[i] -= 5;
		}
		String destString = new String(result);
		
		return destString;
	}

}

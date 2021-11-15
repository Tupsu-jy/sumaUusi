package teht6;

public class Main {

	public static void main(String[] args) {

		WritingIF test1 = new WriteRead();
		
		test1.write("Hello world!");
		
		System.out.println(test1.read());

		WritingIF test2 = new Encrypter(test1);
		
		test2.write("Hello world!");
		
		System.out.println(test2.read());
	}

}

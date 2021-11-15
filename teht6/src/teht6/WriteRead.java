package teht6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteRead implements WritingIF {

	@Override
	public void write(String input) {
		File myObj;
	    try {
	        myObj = new File("filename.txt");
	        if (myObj.createNewFile()) {
	          System.out.println("File created: " + myObj.getName());
	        } else {
	          System.out.println("File already exists.");
	        }
	        
	        FileWriter myWriter = new FileWriter("filename.txt");
	        myWriter.write(input);
	        myWriter.close();
	        System.out.println("Successfully wrote to the file.");

	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	}

	@Override
	public String read() {
		String output = "";
	    try {
	        File myObj = new File("filename.txt");
	        Scanner myReader = new Scanner(myObj);
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          output = output + data;
	        }
	        myReader.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }

		return output;
	}

}

package teht12;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");

        ArrayList<Image> images = new ArrayList<Image>();

        for (int i = 0; i < 10; i++) {
			images.add(new ProxyImage("apustaja"+(i+1)+".jpg"));
		}
        
        System.out.println("Showing image folder contents");
        for (Image image : images) {
			image.showData();
		}
        
        Scanner scan = new Scanner(System.in);
        int imageToView;
        while (true) {
        	System.out.println("Type the number of image u want to view. Type exit to exit");
        	try{
        		imageToView=scan.nextInt();
        	}
        	catch(Exception e){
        		break;
        	}
        	
        	images.get(imageToView).displayImage();
        }
	}

}

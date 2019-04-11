package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImageFolder {
	
	private List<Image> images;
	
	public ImageFolder() {
		this.images = new ArrayList<>();
	}
	
	public void addImage(Image image) {
		this.images.add(image);
	}
	
	public void removeImage(Image image) {
		this.images.remove(image);
	}
	
	public void printImageNames() {
		System.out.println("Image folder:");
		images.forEach(Image::showData);
	}
	
	private void printMenu() {
		System.out.println("Next image: j");
		System.out.println("Previous image: k");
		System.out.println("Exit: e");
	}
	
	public void browseImages() {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		String input = "";
		boolean loop = true;
		while(loop) {
			Image img = images.get(i);
			img.displayImage();
			printMenu();
			input = sc.nextLine();
			switch(input) {
				case "j":
					i++;
					break;
				case "k":
					i--;
					break;
				case "e":
					loop = false;
					break;
			}
			if(i < 0) {
				i = images.size()-1;
			} else if(i >= images.size()) {
				i = 0;
			}
		}
		sc.close();
	}
}

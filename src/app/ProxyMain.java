package app;

public class ProxyMain {

	public static void main(String[] args) {
		ImageFolder folder = new ImageFolder();
		Image img = new ProxyImage("proxy.jpg");
		img.showData();
		
		folder.addImage(new ProxyImage("joku.jpg"));
		folder.addImage(new ProxyImage("img.jpg"));
		folder.addImage(img);
		folder.printImageNames();
		System.out.println("");
		folder.browseImages();
	}

}

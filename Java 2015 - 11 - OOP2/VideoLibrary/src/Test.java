
public class Test {

	public static void main(String[] args) {
		VideoLibrary library = new VideoLibrary("central");
		library.addVCassette("Orkestur bez ime", 120);
		library.addVCassette("Shrek", 121);
		library.addVCassette("Shrek 2", 122);
		library.addVCassette("Shrek 3", 123);
		
		library.createUser("pesho");
		
		System.out.println(library.getAllVHSinfo());
		
		library.takeVHS("Shrek 2", "pesho"); 
		
		library.printRents();
		
		library.returnVHS("Shrek 2", "pesho");
		
		library.printRents();
	}
}

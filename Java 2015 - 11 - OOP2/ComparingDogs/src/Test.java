import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		List<Dog> list = new ArrayList<>();
		
		System.out.println("Dogs put in list randomly:");
		for (int i = 0; i < 50; i++) {
			Random rnd = new Random();
			Dog d = new Dog("doggie " + i, rnd.nextInt(100));
			System.out.println(d.getName() + " - " + d.getAge());
			list.add(d);
		}
		
		Collections.sort(list);

		System.out.println("-------------------------------------------------------------------------\nDogs sorted in list:");
		for(Dog dd : list) {
			System.out.println(dd.getName() + " - " + dd.getAge());
		}
		
		System.out.println("\n-------------------------------------------------------------------------\nDogs' unique numbers:");
		for(Dog dd : list) {
			System.out.println(dd.getUniqueNumber() );
		}
	}

}

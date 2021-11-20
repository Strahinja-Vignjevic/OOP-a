import java.io.IOException;

public class mejn {
	public static void main(String[] args) throws IOException {
		Skolica sk = new Skolica("C:\\Users\\strah\\eclipse-workspace\\ucenici genijalci\\src\\ucenik.txt");		

		System.out.println("Peasanti su: ");
		Ucenik[] u = sk.izdvojpeasante();
		for (int i = 0; i < u.length; i++) {
			System.out.println(u[i]);
		}
		Student s = sk.najboljiFakultetastehnickihnauka();
		System.out.println("Najbolji Student na FTN-U je: " + s);
		Peasant p = sk.najgoriosnovac();
		System.out.println("Najgori osnovac je: "+p);
	}
}

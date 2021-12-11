package hrana;

public class testHrana {

	public static void main(String[] args) {
		jabuka j = new jabuka(220.0,50.0, "crvena");
		jabuka a = new jabuka(115.0,60.0,"zelena");
		j.Baci();
		a.Baci();
		System.out.println( j.toString());
		System.out.println( a.toString());
		supa s = new supa(200.0,5.0,20.0);
		supa u = new supa(200.0,5.0,60.0);
		s.Baci();
		u.Baci();
		System.out.println( s.toString());
		System.out.println( u.toString());
	}

}

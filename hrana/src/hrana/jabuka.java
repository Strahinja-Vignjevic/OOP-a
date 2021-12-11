package hrana;

public class jabuka extends hrana {

	String boja;
	public jabuka(double tezina, double domet,String boja) {
		super(tezina,domet);
		this.boja = boja;
	}
	public void Baci() {
		if(tezina > 200.0) {
				System.out.println("ogromna "+boja+"jabuka leti kroz vazduh");				
		}else
			System.out.println(boja+"jabuka leti kroz vazduh");
}
	String getboja() {
		return boja;
	}
	void setboja() {
		this.boja = "zelena";
	}
	@Override
	public String toString() {
		return "[Jabuka] boja:" + boja + ",tezina: " + tezina + "g, domet: "+domet+"m";
	}
}

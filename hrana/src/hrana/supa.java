package hrana;

public class supa extends hrana {
	double temperatura;
	
	public supa(double tezina, double domet, double temperatura) {
		super(tezina, domet);
		this.temperatura = temperatura;
	}
	public double gettemperatura() {
		return temperatura;
	}
	public void settemperatura() {
		this.temperatura = 37.0;
	}
	public void Baci() {
		if(temperatura < 30.0) {
			System.out.println("ledena supa krstari vazduhom ka svojoj meti");				
	}else if(30.0 < temperatura && temperatura < 45.0) {
		System.out.println("mlaka supa krstari vazduhom ka svojoj meti");
	}else if(temperatura > 45.0) {
		System.out.println("topla supa krstari vazduhom ka svojoj meti");
	}
	}
	@Override
	public String toString() {
		return "[Supa] temperatura:" + temperatura + ",tezina: " + tezina + "g, domet: "+domet+"m";
	}
}

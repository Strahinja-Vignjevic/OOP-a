package hrana;

public abstract class hrana {

	 double tezina;
	 double domet;

	hrana(double tezina,double domet){
		this.tezina = tezina;
		this.domet = domet;
	}
	hrana(){
		this.tezina = 0;
		this.domet = 0;
	}
	public double gettezina() {
		return tezina;
	}
	public double getdomet() {
		return domet;
	}
	public void Baci() {}
	@Override
	 public String toString() {
		return "tezina: 220.0g, domet: 60.0m"
				+ "tezina 115.0, domet: 50.0m";
	}
	
}

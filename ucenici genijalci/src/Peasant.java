
public class Peasant extends Ucenik {

	private boolean Osnovac;
	
	
	public Peasant(String ime, boolean jeStudent, double prosek, boolean Osnovac) {
		super(ime, jeStudent, prosek);
		this.Osnovac = Osnovac;
	}

	public boolean getOsnovac() {
		return Osnovac;
	}
	@Override
	public String toString() {
		return super.toString() + ", Peasant [Da li je osnovac=" + Osnovac + "]";
	}

}

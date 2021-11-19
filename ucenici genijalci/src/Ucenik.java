
public class Ucenik {
	
	private String ime;
	private boolean jeStudent;
	private double prosek;
	
	public Ucenik(String ime, boolean jeStudent,double prosek) {
		this.ime = ime;
		this.jeStudent = jeStudent;
		this.prosek = prosek;
	}
	public String getime() {
		return ime;
	}
	public boolean getStudent() {
		return jeStudent;
	}
	public double getprosek() {
		return prosek;
	}
	@Override
	public String toString() {
		return ime + ", Student: " + jeStudent + ",Prosek:"+prosek;
	}
}

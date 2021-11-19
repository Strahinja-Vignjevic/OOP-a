
public class Student extends Ucenik {

	private String faks;
	private int godina;
	
	public Student(String ime, boolean jeStudent, double prosek,String faks,int godina) {
		super(ime, jeStudent, prosek);
		this.faks = faks;
		this.godina = godina;
	}
	public String getfaks() {
		return faks;
	}
	public int getgodina() {
		return godina;
	}
	@Override
	public String toString() {
		return super.toString() + ", Student [Fakultet:" + faks + ",Godina:"+godina+".]";
	}

}

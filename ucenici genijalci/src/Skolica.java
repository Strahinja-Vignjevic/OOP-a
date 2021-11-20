import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Skolica {
	
	private Ucenik[] nizuc;
	
	public Skolica(String fajl) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fajl));
		
		int brdjaka = Integer.parseInt(br.readLine().trim());
		nizuc = new Ucenik[brdjaka];

		for (int i = 0; i < brdjaka; i++) {
			String linija = br.readLine();
			String[] tokeni = linija.split(",");

			String tipUcenika = tokeni[0].trim();
			String ime = tokeni[1].trim();
			boolean Student = tokeni[2].trim().equals("Y");
			double prosek = Double.parseDouble(tokeni[3].trim());
			if (tipUcenika.equals("P")) {
				boolean Osnovac = tokeni[4].trim().equals("O");
				nizuc[i] = new Peasant(ime, Student ,prosek,Osnovac );
			} else {
				String faks = tokeni[4].trim();
				int godina = Integer.parseInt(tokeni[5].trim());
				nizuc[i] = new Student(ime, Student ,prosek, faks,godina);
			}
		}
		br.close();
	}
	
	public Ucenik[] getnizuc() {
		return nizuc;
	}
	public Ucenik[] izdvojpeasante() {
	int brojpeasanta = 0;	
	for (int i = 0; i < nizuc.length; i++) {
		if (!nizuc[i].getStudent()) {
			brojpeasanta++;
		}
	}
	Ucenik[] mucenici = new Ucenik[brojpeasanta];
	int j = 0;
	for (int i = 0; i < nizuc.length; i++) {
		if (!nizuc[i].getStudent()) {
			mucenici[j] = nizuc[i];
			j++;
		}
	}

	return mucenici;
		
	}
	
	public Student najboljiFakultetastehnickihnauka() {
		Student najbolji = null;

		for (int i = 0; i < nizuc.length; i++) {
			if (nizuc[i].getStudent() && nizuc[i] instanceof Student) {
				Student s = (Student) nizuc[i];
				if (najbolji == null)
					najbolji = s;
				else if ((s.getprosek() >= najbolji.getprosek())&& s.getfaks().equals("FTN"))
					najbolji = s;
			}
		}
		return najbolji;
	}
	public Peasant najgoriosnovac() {
		Peasant najgori = null;

		for (int i = 0; i < nizuc.length; i++) {
			if (!nizuc[i].getStudent() && nizuc[i] instanceof Peasant) {
				Peasant s = (Peasant) nizuc[i];
				if(!s.getOsnovac()) {
					continue;
				}
				if (najgori == null)
					najgori = s;
				else if ((s.getprosek() <= najgori.getprosek())&& s.getOsnovac())
					najgori = s;
			}
		}
		return najgori;
	}
}

package Domaci3;

public class polovniKombi extends PolovnoVozilo {
	
	int brojsedista;
	
	public polovniKombi()
	{
		super();
		this.brojsedista=0;
	}
	
	public polovniKombi(int sedista,int godine)
	{
		super(godine);
		this.brojsedista=sedista;
	}


	public int cena() {
		
		return baznaCena()+50*this.brojsedista;
	}

	@Override
	public String opisVozila() {
		return "Kombi ima " + this.starostvozila + " godina i " + this.brojsedista + " sedista";
	}
	

}

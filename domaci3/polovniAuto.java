package Domaci3;

class polovniAuto extends PolovnoVozilo
{
	int brojVrata;
	
	public polovniAuto()
	{
		super();
		this.brojVrata=0;
	}
	
	public polovniAuto(int vrata,int godine)
	{
		super(godine);
		this.brojVrata=vrata;
	}
	
	public int cena()
	{
		if(this.brojVrata>3)
		{
			return baznaCena();
		}
		else
		{
			return baznaCena()-baznaCena()*5/100;
		}
	}

	@Override
	public String opisVozila() {
		
		return "Auto ima " + this.starostvozila + " godina i " + this.brojVrata + " vrata i kosta " + this.cena();
	}
	
}
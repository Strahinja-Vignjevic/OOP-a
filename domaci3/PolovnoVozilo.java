package Domaci3;

public abstract class PolovnoVozilo {
	int starostvozila;
	
	public PolovnoVozilo()
	{
		this.starostvozila=0;
	}
	
	public PolovnoVozilo(int godine)
	{
		this.starostvozila=godine;
	}
	
	public abstract int cena();
			
	public abstract String opisVozila();

	public String toString()
	{
		return "Vozilo je staro " + this.starostvozila + " godina."; 
	}
	
	protected int baznaCena()
	{
		if(this.starostvozila>20)
		{
			return 400;
		}
		else
		{
			return 2000-this.starostvozila*70;
		}
	}
	
}


package Lista_de_Exercicios_2.questao_12;

public class Registros {
    private int km;
    private int litros;
    private int kmTotal = 0;
	private int litrosTotal =0;
    
    public Registros(int km, int litros){
        this.km = km;
        this.litros = litros;
    }

    public void totalKm(int km) {
		this.kmTotal += km;
		
	}
	public void totalLitros(int litros){
		this.litrosTotal += litros;
	}

	public Registros(){
    }


    public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public int getLitros() {
		return litros;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}

	public int getKmTotal() {
		return kmTotal;
	}

	public void setKmTotal(int kmTotal) {
		this.kmTotal = kmTotal;
	}

	
	public int getLitrosTotal() {
		return litrosTotal;
	}

	public void setLitrosTotal(int litrosTotal) {
		this.litrosTotal = litrosTotal;
	}


	@Override
    public String toString() {
        return "Km total: " + km + "\nLitros total: " + litros;
    }
}

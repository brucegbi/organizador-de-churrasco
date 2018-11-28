
public class BebidasAlcoolicas extends Bebidas {

	public BebidasAlcoolicas(double litro) {
		super(litro);
	}

	private double totalBebidasAlcoolicas;
	private double totalPorConvidados;
	
	
	Convidados convidado = new Convidados();
	
	double convidadosAlcoolicos = convidado.getQuantidadeAlcoolicos();
	
	public double getTotalBebidasAlcoolicas() {
		return totalBebidasAlcoolicas;
	}

	public void setTotalBebidasAlcoolicas(double totalBebidasAlcoolicas) {
		this.totalBebidasAlcoolicas = totalBebidasAlcoolicas;
	}
	
	public void CalcularBebidasAlcoolicas() {
		
	this.totalPorConvidados = getLitro()*convidadosAlcoolicos;
	
	}

	public double getTotalPorConvidados() {
		return totalPorConvidados;
	}

	public void setTotalPorConvidados(double totalPorConvidados) {
		this.totalPorConvidados = totalPorConvidados;
	}
	
}

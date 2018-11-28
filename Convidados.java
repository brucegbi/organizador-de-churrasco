public class Convidados {
	
	private int quantidadeHomem;
	private int quantidadeMulher;
	private int quantidadeAlcoolicos;
	private int totalConvidados;
	private double quantidadeNaoAlcoolicos;
	
	public double getQuantidadeNaoAlcoolicos() {
		return quantidadeNaoAlcoolicos;
	}

	public void setQuantidadeNaoAlcoolicos(int quantidadeNaoAlcoolicos) {
		this.quantidadeNaoAlcoolicos = quantidadeNaoAlcoolicos;
	}

	public int getQuantidadeHomem() {
		return quantidadeHomem;
	}

	public void setQuantidadeHomem(int quantidadeHomem) {
		this.quantidadeHomem = quantidadeHomem;
	}

	public int getQuantidadeMulher() {
		return quantidadeMulher;
	}

	public void setQuantidadeMulher(int quantidadeMulher) {
		this.quantidadeMulher = quantidadeMulher;
	}

	public void setTotalConvidados(int totalConvidados) {
		this.totalConvidados = totalConvidados;
	}

	public double getTotalConvidados() {
		return totalConvidados;
	}

	public int getQuantidadeAlcoolicos() {
		return quantidadeAlcoolicos;
	}

	public void setQuantidadeAlcoolicos(int quantidadeAlcoolicos) {
		this.quantidadeAlcoolicos = quantidadeAlcoolicos;
	}

	public void CalcularTotal() {
		
		this.totalConvidados = quantidadeHomem+quantidadeMulher;
	}
	
	public void CalcularNaoAlcoolicos(){
		
		this.quantidadeNaoAlcoolicos = totalConvidados - quantidadeAlcoolicos;
		
	}
	
}

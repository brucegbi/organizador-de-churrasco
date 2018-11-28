import javax.swing.JOptionPane;

public class ChurrascoBasico {
	
	//private Carnes carnes;
	
	
	public void ExecultarChurrascoBasico() {
		
		String stringQuilolinguica = JOptionPane.showInputDialog("Quantos quilos de linguiça?");
		double quiloLinguica = Double.parseDouble(stringQuilolinguica);
		Carnes linguica = new Carnes(quiloLinguica);
		System.out.println("Quilos de linguica: " + linguica.getQuilo());
		//carnes = linguica;
		
		String stringQuiloContraFile = JOptionPane.showInputDialog("Quantos quilos de contra filé?");
		double quiloContraFile = Double.parseDouble(stringQuiloContraFile);
		Carnes contrafile = new Carnes(quiloContraFile);
		System.out.println("Quilos de contra filé: " + contrafile.getQuilo());
		
		String stringQuiloFrango = JOptionPane.showInputDialog("Quantos quilos de Frango?");
		double quiloFrango = Double.parseDouble(stringQuiloFrango);
		Carnes frango = new Carnes(quiloFrango);
		System.out.println("Quilos de Frango: " + frango.getQuilo());
		
		String stringLitroCerveja = JOptionPane.showInputDialog("Quantos litros de cerveja?");
		double litroCerveja = Double.parseDouble(stringLitroCerveja);
		BebidasAlcoolicas cerveja = new BebidasAlcoolicas(litroCerveja);
		System.out.println("Litros de cerveja: " + cerveja.getLitro());
		
		String stringLitroSuco = JOptionPane.showInputDialog("Quantos litros de suco?");
		double litroSuco = Double.parseDouble(stringLitroSuco);
		BebidasNaoAlcoolicas suco = new BebidasNaoAlcoolicas(litroSuco);
		System.out.println("Litros de Suco: " + suco.getLitro());
		
		String stringLitroRefrigerante = JOptionPane.showInputDialog("Quantos litros de refrigerante?");
		double litroRefrigerante = Double.parseDouble(stringLitroRefrigerante);
		BebidasNaoAlcoolicas refrigerante = new BebidasNaoAlcoolicas(litroRefrigerante);
		System.out.println("Litros de refrigerante: " + refrigerante.getLitro());
		
		String stringQuiloMandioca = JOptionPane.showInputDialog("Quantos quilos de mandioca?");
		double quiloMandioca = Double.parseDouble(stringQuiloMandioca);
		Acompanhamentos mandioca = new Acompanhamentos(quiloMandioca);
		System.out.println("Quilos de mandioca: " + mandioca.getQuilo());
		
		String stringQuiloTomate = JOptionPane.showInputDialog("Quantos quilos de tomate?");
		double quiloTomate = Double.parseDouble(stringQuiloTomate);
		Acompanhamentos tomate = new Acompanhamentos(quiloTomate);
		System.out.println("Quilos de tomate: " + tomate.getQuilo());
		
		String stringQuiloFarofa = JOptionPane.showInputDialog("Quantos quilos de farofa?");
		double quiloFarofa = Double.parseDouble(stringQuiloFarofa);
		Acompanhamentos farofa = new Acompanhamentos(quiloFarofa);
		System.out.println("Quilos de Farofa: " + farofa.getQuilo());	
	}	
}
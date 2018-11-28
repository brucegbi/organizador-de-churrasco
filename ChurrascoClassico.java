import javax.swing.JOptionPane;

public class ChurrascoClassico {
	
	public void ExecultarChurrascoClassico() {
		
		String stringQuiloalcatra = JOptionPane.showInputDialog("Quantos quilos de alcatra?");
		double quiloAlcatra = Double.parseDouble(stringQuiloalcatra);
		Carnes alcatra = new Carnes(quiloAlcatra);
		System.out.println("Quilos de alcatra: " + alcatra.getQuilo());
		
		String stringQuiloMaminha = JOptionPane.showInputDialog("Quantos quilos de maminha?");
		double quiloMaminha = Double.parseDouble(stringQuiloMaminha);
		Carnes maminha = new Carnes(quiloMaminha);
		System.out.println("Quilos de maminha: " + maminha.getQuilo());
		
		String stringQuiloCupim = JOptionPane.showInputDialog("Quantos quilos de Cupim?");
		double quiloCupim = Double.parseDouble(stringQuiloCupim);
		Carnes cupim = new Carnes(quiloCupim);
		System.out.println("Quilos de Frango: " + cupim.getQuilo());
		
		String stringLitroCerveja = JOptionPane.showInputDialog("Quantos litros de cerveja?");
		double litroCerveja = Double.parseDouble(stringLitroCerveja);
		BebidasAlcoolicas cerveja = new BebidasAlcoolicas(litroCerveja);
		System.out.println("Litros de cerveja: " + cerveja.getLitro());
		
		String stringLitroVinho = JOptionPane.showInputDialog("Quantos litros de cerveja?");
		double litroVinho = Double.parseDouble(stringLitroVinho);
		BebidasAlcoolicas vinho = new BebidasAlcoolicas(litroVinho);
		System.out.println("Litros de vinho: " + vinho.getLitro());
		
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
		
		String stringQuiloMaionese = JOptionPane.showInputDialog("Quantos quilos de tomate?");
		double quiloMaionese = Double.parseDouble(stringQuiloMaionese);
		Acompanhamentos maionese = new Acompanhamentos(quiloMaionese);
		System.out.println("Quilos de Maionese: " + maionese.getQuilo());
	}	
}
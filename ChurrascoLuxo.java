import javax.swing.JOptionPane;

public class ChurrascoLuxo {
	
	public void ExecultarChurrascoLuxo() {
		
		String stringQuiloPicanha = JOptionPane.showInputDialog("Quantos quilos de picanha?");
		double quiloPicanha = Double.parseDouble(stringQuiloPicanha);
		Carnes picanha = new Carnes(quiloPicanha);
		System.out.println("Quilos de picanha: " + picanha.getQuilo());
		
		String stringQuiloCostela = JOptionPane.showInputDialog("Quantos quilos de costela?");
		double quiloCostela = Double.parseDouble(stringQuiloCostela);
		Carnes costela = new Carnes(quiloCostela);
		System.out.println("Quilos de costela: " + costela.getQuilo());
		
		String stringQuiloFraldinha = JOptionPane.showInputDialog("Quantos quilos de Fraldinha?");
		double quiloFraldinha = Double.parseDouble(stringQuiloFraldinha);
		Carnes fraldinha = new Carnes(quiloFraldinha);
		System.out.println("Quilos de Fraldinha: " + fraldinha.getQuilo());
		
		String stringLitroCerveja = JOptionPane.showInputDialog("Quantos litros de cerveja?");
		double litroCerveja = Double.parseDouble(stringLitroCerveja);
		BebidasAlcoolicas cerveja = new BebidasAlcoolicas(litroCerveja);
		System.out.println("Litros de cerveja: " + cerveja.getLitro());
		
		String stringLitroWhisky = JOptionPane.showInputDialog("Quantos litros de whisky?");
		double litroWhisky = Double.parseDouble(stringLitroWhisky);
		BebidasAlcoolicas whisky = new BebidasAlcoolicas(litroWhisky);
		System.out.println("Litros de whisky: " + whisky.getLitro());
		
		String stringLitroCaipirinha = JOptionPane.showInputDialog("Quantos litros de caipirinha?");
		double litroCaipirinha = Double.parseDouble(stringLitroCaipirinha);
		BebidasAlcoolicas caipirinha = new BebidasAlcoolicas(litroCaipirinha);
		System.out.println("Litros de caipirinha: " + caipirinha.getLitro());

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

		String stringQuiloFarofa = JOptionPane.showInputDialog("Quantos quilos de farrofa?");
		double quiloFarofa = Double.parseDouble(stringQuiloFarofa);
		Acompanhamentos farofa = new Acompanhamentos(quiloFarofa);
		System.out.println("Quilos de Farofa: " + farofa.getQuilo());	

		String stringQuiloMaionese = JOptionPane.showInputDialog("Quantos quilos de tomate?");
		double quiloMaionese = Double.parseDouble(stringQuiloMaionese);
		Acompanhamentos maionese = new Acompanhamentos(quiloMaionese);
		System.out.println("A quantidade de maionese é: " + maionese.getQuilo());

		String stringQuiloPaoDeAlho = JOptionPane.showInputDialog("Quantos quilos de pao de alho?");
		double quiloPaoDeAlho = Double.parseDouble(stringQuiloPaoDeAlho);
		Acompanhamentos paoDeAlho = new Acompanhamentos(quiloPaoDeAlho);
		System.out.println("A quantidade de pao de alho é: " + paoDeAlho.getQuilo());
                
	}	
}
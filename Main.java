import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {

		Convidados convidado = new Convidados();
		ChurrascoBasico churrascoBasico = new ChurrascoBasico();
		ChurrascoClassico churrascoClassico = new ChurrascoClassico();
		ChurrascoLuxo churrascoDeLuxo = new ChurrascoLuxo();
		
		JLabel homemLabel = new JLabel("   Homens:");
		JLabel mulherLabel = new JLabel("   Mulheres:");
		JLabel convidadosAlcoolicos = new JLabel("   Quantos bebem bebidas alcoolicas?");
		JTextField homemText = new JTextField();
		JTextField mulherText = new JTextField();
		JTextField alcoolicosText = new JTextField();
		JButton calcular = new JButton("Calcular");
		JLabel calcularLabel = new JLabel("   Clique para calcular o total de convidados:");
		
		JFrame frame = new JFrame("Meu Churrasco");
		frame.setLayout(new BorderLayout());
		frame.setBounds(400, 200, 600, 300);
		
		JPanel painelSuperior = new JPanel();
		
		frame.add(painelSuperior, BorderLayout.NORTH);
		painelSuperior.setLayout(new GridLayout(3, 3));
		
		painelSuperior.add(homemLabel);
		painelSuperior.add(homemText);
		painelSuperior.add(mulherLabel);
		painelSuperior.add(mulherText);
		painelSuperior.add(convidadosAlcoolicos);
		painelSuperior.add(alcoolicosText);
		
		JPanel painelCentral = new JPanel();
		
		frame.add(painelCentral, BorderLayout.CENTER);
		painelCentral.setLayout(new BorderLayout());
		JPanel painelInterno = new JPanel();
		painelCentral.add(painelInterno, BorderLayout.WEST);
		painelInterno.setLayout(new GridLayout(4, 1));
		
		JRadioButton ChurrascoBasico = new JRadioButton("Churrasco Basico");
		JRadioButton ChurrascoClassico = new JRadioButton("Churrasco Classico");
		JRadioButton ChurrascoDeLuxo = new JRadioButton("Churrasco De Luxo");
		
		painelInterno.add(ChurrascoBasico);
		painelInterno.add(ChurrascoClassico);
		painelInterno.add(ChurrascoDeLuxo);
		
		JPanel painelInterno02 = new JPanel();
		painelCentral.add(painelInterno02, BorderLayout.EAST);
		painelInterno02.setLayout(new GridLayout(1, 1));
		
		JPanel painelInferior = new JPanel();
		painelCentral.add(painelInferior, BorderLayout.SOUTH);
		painelInferior.setLayout(new GridLayout(1, 2));
		
		painelInferior.add(calcularLabel);
		painelInferior.add(calcular);
		
		//JTable tabela = new JTable(arg0);
		
		homemText.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String h = homemText.getText();
				int qntHomem = Integer.parseInt(h);
				convidado.setQuantidadeHomem(qntHomem);
				System.out.println("Quantidade de Homens: " + convidado.getQuantidadeHomem());
			}
		});
		
		mulherText.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String m = mulherText.getText();
				int qntMulher = Integer.parseInt(m);
				convidado.setQuantidadeMulher(qntMulher);
				System.out.println("Quantidade de mulheres: " + convidado.getQuantidadeMulher());
			}
		});
		
		alcoolicosText.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String ca =  alcoolicosText.getText();
				int qntAlcoolicos = Integer.parseInt(ca);
				convidado.setQuantidadeAlcoolicos(qntAlcoolicos);
				System.out.println("Quantidade de pessoas alcoolicas: " + convidado.getQuantidadeAlcoolicos());
			}
		});

		calcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				convidado.CalcularTotal();
				convidado.CalcularNaoAlcoolicos();
				System.out.println("O total de convidados é: " + convidado.getTotalConvidados());
				System.out.println("O total de convidados não alcoolicos é: " + convidado.getQuantidadeNaoAlcoolicos() );
				System.out.println("O total de convidado alcoolicos é: " + convidado.getQuantidadeAlcoolicos());
			}
		});
				
		ChurrascoBasico.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				churrascoBasico.ExecultarChurrascoBasico();
				//JOptionPane.showMessageDialog(null, "Carnes: " + churrascoBasico.carnes.getQuilo());
				
			}
		});

		ChurrascoClassico.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				churrascoClassico.ExecultarChurrascoClassico();
				
			}
		});
		
		ChurrascoDeLuxo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				churrascoDeLuxo.ExecultarChurrascoLuxo();
				
			}
		});
		
		frame.setVisible(true);

}
}

import javax.swing.JOptionPane;

public class exer20 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome?");
		int ct = 1;
		double totais = 0;
		while (ct <= 12) {
			String salario = JOptionPane.showInputDialog("Digite o " + ct + " salário");
			Double valor = Double.parseDouble(salario);
			totais += valor;
			++ct;
		}
		double media = totais / 12;
		JOptionPane.showMessageDialog(null, "13º salário do "+ nome + " é "+ media); 
		System.exit(0);
	}

}

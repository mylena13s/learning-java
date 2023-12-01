import javax.swing.JOptionPane;

public class exer17 {

	public static void main(String[] args) {
		String idade = JOptionPane.showInputDialog("Digite a sua idade?");
		int v1 = Integer.parseInt(idade);
		String relatorio = "";
		if (v1 >=18) {
			relatorio = "Você já pode tirar sua carteira de motorista!";
		} else {
			relatorio = "Você não pode tirar sua carteira de motorista!";
		}
		JOptionPane.showMessageDialog(null, relatorio);
		System.exit(0);
	

	}

}

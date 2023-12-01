import javax.swing.JOptionPane;

public class Exer10 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o seu nome?");
		String sobrenome = JOptionPane.showInputDialog("Digite o seu sobrenome?");
		String completo = nome + " " + sobrenome;
		JOptionPane.showMessageDialog(null, completo);
		System.exit(0);

	}

}

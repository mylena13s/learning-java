import javax.swing.JOptionPane;

public class exer21 {

	public static void main(String[] args) {
		String qtd = JOptionPane.showInputDialog("Digite quantos filhos?"); 
		int filhos = Integer.parseInt(qtd);
		int ct = 1;
		String rel = "";
		while (ct <= filhos) {
			String nome = JOptionPane.showInputDialog("Digite o " + ct + " nome?"); 
			String idade = JOptionPane.showInputDialog("Digite a " + ct + " idade?");
			rel += "nome="+nome + "  idade=" + idade + "\n";
			++ct;
		}
		JOptionPane.showMessageDialog(null, rel);
		System.exit(0);
	}

}

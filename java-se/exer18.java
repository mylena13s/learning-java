import javax.swing.JOptionPane;

public class exer18 {

	public static void main(String[] args) {
		// recebendo valores da interface
		String v1 = JOptionPane.showInputDialog("Digite o número 1?");
		String v2 = JOptionPane.showInputDialog("Digite o número 2?");
		// conversão de valores
		int vl1 = Integer.parseInt(v1);
		int vl2 = Integer.parseInt(v2);
		// logica da programação
		String relatorio = " "; 
		if (vl1 > vl2) { 
			relatorio += v1;
		} else { 
			if (vl1 < vl2) {
				relatorio += vl2;
			} else {
				relatorio += "iguais " + vl1;
			}
		}
		JOptionPane.showMessageDialog(null, relatorio);
		System.exit(0);
	}
}

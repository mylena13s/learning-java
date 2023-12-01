
public class exer15 {

	public static void main(String[] args) {
		String texto = "1";
		
		// String para tipos primitivos.
		int v1 = Integer.parseInt(texto);
		System.out.println(v1);
		byte v2 = Byte.parseByte(texto);
		System.out.println(v2);
		short v3 = Short.parseShort(texto);
		System.out.println(v3);
		float v4 = Float.parseFloat(texto);
		System.out.println(v4);
		double v5 = Double.parseDouble(texto);
		System.out.println(v5);
		long v6 = Long.parseLong(texto);
		System.out.println(v6);
		
		// Tipos primitivos para string.
		texto = String.valueOf(v1);
		System.out.println(texto);
		texto = String.valueOf(v2);
		System.out.println(texto);
		texto = String.valueOf(v3);
		System.out.println(texto);
		texto = String.valueOf(v4);
		System.out.println(texto);
		texto = String.valueOf(v5);
		System.out.println(texto);
		texto = String.valueOf(v6);
		System.out.println(texto);
		
		
	

	}

}

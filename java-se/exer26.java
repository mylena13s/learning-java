
public class exer26 {

	public static void main(String[] args) {
		for (int ct=0; ct<= 10; ct++) {
			if (ct== 5) {
				continue; //aborta somente a interação corrente e vai para próxima.
			}
			System.out.println("-> processando " + ct);
		}
		System.out.println("terminando o programa...");

	}

}

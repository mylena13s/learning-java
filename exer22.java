import java.util.Scanner;

public class exer22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mask = 32;
        int n = sc.nextInt();

        if ((n & mask) != 0) {
            System.out.println("6th bit is true!");
        }
        else {
            System.out.println("6th bit is false!");
        }
    }
}

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            for (int i = 10; i <= numero; i+=5) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = 10; i <= numero; i+=3) {
                System.out.print(i + " ");
            }
        }
    }
}

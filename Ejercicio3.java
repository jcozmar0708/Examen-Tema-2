import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura = sc.nextInt();
        if (altura%2 != 0) {
            for (int i = 0; i < altura; i++) {
                int numero_x = 1;
                for (int j = 0; j < altura/2; j++) {
                    if (i != altura/2) System.out.print(" ");
                }
                for (int j = 0; j < numero_x; j++) {
                    System.out.print("X");
                    if (i == altura/2) {
                        for (int k = 0; k < altura - 1; k++) {
                            System.out.print("X");
                        }
                    }
                }
                System.out.println();
            }
        } else System.out.println("Número no válido");
    }
}

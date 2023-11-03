import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        int veces = 0;
        int aprobados = 0;
        double media = 0;
        do {
            nota = sc.nextInt();
            if (nota != -1) {
                media+=nota;
                veces++;
                if (nota >= 5) aprobados++;
            }
        } while (nota != -1);
        media = media / veces;
        System.out.printf("La media es %.2f\n",media);
        System.out.printf("Aprobados: %d - Suspensos: %d",aprobados,veces-aprobados);
    }
}

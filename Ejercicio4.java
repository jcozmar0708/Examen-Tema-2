import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int planta;
        int planta_anterior = 0;
        int primera_vez = 1;
        int recorrido = 0;
        do {
            planta = sc.nextInt();
            if (planta != -1) {
                if (primera_vez == 1) {
                    planta_anterior = planta;
                    primera_vez++;
                } else {
                    if (planta >= planta_anterior) {
                        recorrido = recorrido + (planta - planta_anterior);
                    } else {
                        recorrido = recorrido + (planta_anterior - planta);
                    }
                    planta_anterior = planta;
                }
            }
        } while (planta != -1);
        System.out.println(recorrido);
    }
}

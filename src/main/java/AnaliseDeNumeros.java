import java.io.IOException;
import java.util.Scanner;

public class AnaliseDeNumeros {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int[]  numeros = new int[5];
        int pares = 0, impares = 0, positivos = 0, negativos = 0;

        for (int i=0; i < 5; i++) {
            numeros[i] = leitor.nextInt();

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            if (numeros[i] != 0) {
                if (numeros[i] > 0) {
                    positivos++;
                } else {
                    negativos++;
                }
            }
        }

        System.out.println( pares     + " valor(es) par(es)");
        System.out.println( impares   + " valor(es) impar(es)");
        System.out.println( positivos + " valor(es) positivo(s)");
        System.out.println( negativos + " valor(es) negativo(s)");
    }
}

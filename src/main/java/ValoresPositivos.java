/*import java.util.Scanner;

public class PrimeiroDesafio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float numero;
        int positivo = 0;
        for (int i = 0; i < 6; i++) {
            numero = in.nextFloat();
            if (numero >= 0){
                positivo++;
            }
        }
        System.out.println(positivo + " valores positivos");
    }
}
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ValoresPositivos {
    public static void main(String[] args) throws Exception{
        int contagem = 0;

        BufferedReader val = new BufferedReader(new InputStreamReader(System.in));
        double num;

        for (int i = 0; i < 6; i++) {
            num= Double.parseDouble(val.readLine());
            if (num > 0) {
                contagem++;
            }
        }
        System.out.println(contagem + " valores positivos");
    }
}


/*

Desafio
Crie um programa que leia 6 valores. Você poderá receber valores negativos e/ou positivos como entrada, devendo
desconsiderar os valores nulos. Em seguida, apresente a quantidade de valores positivos digitados.

Entrada
Você receberá seis valores, negativos e/ou positivos.

Saída
Exiba uma mensagem dizendo quantos valores positivos foram lidos assim como é exibido abaixo no exemplo
de saída. Não esqueça da mensagem "valores positivos" ao final.


Exemplo de Entrada	Exemplo de Saída
7                   4 valores positivos
-5
6
-3.4
4.6
12
 */
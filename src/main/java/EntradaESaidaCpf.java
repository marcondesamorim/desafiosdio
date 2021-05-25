import java.util.Scanner;
import java.util.Locale;

public class EntradaESaidaCpf {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));

        Scanner sc = new Scanner(System.in);
        String cpf = sc.nextLine();
        String[] cpfSeparado = cpf.split("\\.|-");
        for (int i = 0; i < cpfSeparado.length; i++) {
            System.out.printf("%s\n",cpfSeparado[i]);
        }
        sc.close();
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class ValidadorSenhas {

    public static void main(String[] args) throws IOException {
        String senha;
        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        senha = line.readLine();

        boolean matches;
        while (senha != null && !senha.isEmpty()) {
            matches = senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]{6,32}$");
            if (matches) {
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");
            }
            senha = line.readLine();
        }
    }
}


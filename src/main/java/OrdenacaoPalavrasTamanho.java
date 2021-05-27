import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class OrdenacaoPalavrasTamanho{

    public static void main(String[]args) throws IOException {

        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));

        int cases = Integer.parseInt(line.readLine());


        for (int i = 0; i < cases; i++) {

            List<String> words = Arrays.stream(line.readLine().split(" ")).collect(Collectors.toList());

            Collections.sort(words, Comparator.comparing(String::length).reversed().thenComparing(String::toString));

            for (String word : words) {
                System.out.print(word + " ");
            }
            System.out.println();
        }
    }

}

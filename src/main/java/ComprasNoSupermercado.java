import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ComprasNoSupermercado
{
    public static void main(String[] args) throws IOException {
        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(line.readLine());

        for (int i = 0; i < tests; i++) {
            List<String> items = Arrays.stream(line.readLine().split(" ")).collect(Collectors.toList());
            List<String> itemsUniques = items.stream().distinct().collect(Collectors.toList());

            Collections.sort(itemsUniques);
            for (String item : itemsUniques) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
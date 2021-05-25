import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumerosPares {
    public static void main(String[] args) throws Exception{
        BufferedReader val = new BufferedReader(new InputStreamReader(System.in));
        int num, i = 2;
        num= Integer.parseInt(val.readLine());
        while (i <= num) {
            System.out.println(i);
            i = i + 2;
        }
    }
}

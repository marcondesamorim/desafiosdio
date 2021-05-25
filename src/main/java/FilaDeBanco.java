import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class FilaDeBanco {
    public static void main(String[] args) throws IOException {

        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        int nQueues = Integer.parseInt(line.readLine());

        for (int i = 0; i < nQueues; i++) {
            int nClients = Integer.parseInt(line.readLine());

            List<Integer> queue = Arrays.stream(line.readLine().split(" ")).map(s -> Integer.parseInt(s)).
                    collect(Collectors.toList());

            List<Integer> orderedQueue = queue.stream().sorted().collect(Collectors.toList());
            Collections.reverse(orderedQueue);

            int change = 0;
            for (int j = 0; j < nClients; j++) {
                if (queue.get(j) == orderedQueue.get(j)) {
                    change++;
                }
            }

            System.out.println(change);
        }
    }
}
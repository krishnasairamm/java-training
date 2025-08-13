import java.util.Scanner;

public class FrequencyCounterNoSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String line = sc.nextLine();

        String[] parts = line.split(" ");
        int n = parts.length;
        int[] arr = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        
        System.out.print("{");
        boolean firstPrinted = true;
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            if (!firstPrinted) {
                System.out.print(", ");
            }
            System.out.print(arr[i] + "=" + count);
            firstPrinted = false;
        }
        System.out.println("}");
    }
}

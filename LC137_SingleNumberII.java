import java.util.*;

public class LC137_SingleNumberII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int result = 0;
        for (int bit = 0; bit < 32; bit++) {
            int count = 0;
            for (int x : a) {
                if ((x & (1 << bit)) != 0) count++;
            }
            if (count % 3 != 0) result |= (1 << bit);
        }

        System.out.println(result);
        sc.close();
    }
}

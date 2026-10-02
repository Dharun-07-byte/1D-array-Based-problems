import java.util.*;

public class LC260_SingleNumberIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int xor = 0;
        for (int x : a) xor ^= x;

        int bit = xor & -xor;
        int first = 0, second = 0;

        for (int x : a) {
            if ((x & bit) != 0) first ^= x;
            else second ^= x;
        }

        System.out.println(first + " " + second);
        sc.close();
    }
}

import java.util.*;

public class LC268_MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int xor = n;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            xor ^= i ^ x;
        }

        System.out.println(xor);
        sc.close();
    }
}

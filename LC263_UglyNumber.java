import java.util.*;

public class LC263_UglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println(false);
        } else {
            int[] factors = {2, 3, 5};
            for (int f : factors) {
                while (n % f == 0) n /= f;
            }
            System.out.println(n == 1);
        }
        sc.close();
    }
}

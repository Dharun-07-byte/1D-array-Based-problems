import java.util.*;

public class LC1295_EvenNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int x = Math.abs(sc.nextInt());
            int digits = String.valueOf(x).length();
            if (digits % 2 == 0) count++;
        }

        System.out.println(count);
        sc.close();
    }
}

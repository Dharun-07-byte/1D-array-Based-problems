import java.util.*;

public class LC66_PlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] digits = new int[n];
        for (int i = 0; i < n; i++) digits[i] = sc.nextInt();

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                for (int x : digits) System.out.print(x + " ");
                sc.close();
                return;
            }
            digits[i] = 0;
        }

        System.out.print("1 ");
        for (int x : digits) System.out.print(x + " ");
        sc.close();
    }
}

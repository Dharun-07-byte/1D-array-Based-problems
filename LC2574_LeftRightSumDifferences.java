import java.util.*;

public class LC2574_LeftRightSumDifferences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            total += a[i];
        }

        int left = 0;
        for (int i = 0; i < n; i++) {
            int right = total - left - a[i];
            System.out.print(Math.abs(left - right) + " ");
            left += a[i];
        }
        sc.close();
    }
}

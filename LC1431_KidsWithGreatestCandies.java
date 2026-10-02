import java.util.*;

public class LC1431_KidsWithGreatestCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candies = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
            if (candies[i] > max) max = candies[i];
        }

        int extra = sc.nextInt();

        for (int x : candies) {
            System.out.print((x + extra >= max) + " ");
        }
        sc.close();
    }
}

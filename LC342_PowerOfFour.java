import java.util.*;

public class LC342_PowerOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println(false);
        } else {
            while (n % 4 == 0) n /= 4;
            System.out.println(n == 1);
        }
        sc.close();
    }
}

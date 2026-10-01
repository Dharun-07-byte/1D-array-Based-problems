import java.util.*;

public class LC136_SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) result ^= sc.nextInt();

        System.out.println(result);
        sc.close();
    }
}

package chapter3;

import java.util.Scanner;

public class 일이_될_때까지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        while (n > 1){
            int val = n % m;
            if (val > 0){
                count += val;
                n -= val;
            }
            n /= m;
            count += 1;
        }
        System.out.println(count);
    }
}

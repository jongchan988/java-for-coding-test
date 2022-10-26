package chapter3;

import java.util.Scanner;

public class 숫자_카드_게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;


        for(int i = 0; i < n; i++){
            int min = 10000;
            for(int j = 0; j < m; j++){
                int input_int = sc.nextInt();
                if (min > input_int){
                    min = input_int;
                }
            }
            if (result < min){
                result = min;
            }
        }
        System.out.println(result);
    }
}

package chapter4;

import java.util.Scanner;

public class 시각 {
    public static boolean check(int value){
        return value % 10 == 3 || value / 10 ==3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i <= n; i++){
            for(int j = 0; j < 60; j++){
                for(int k = 0; k < 60; k++){
                    if (check(i) || check(j) || check(k)){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}

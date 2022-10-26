package chapter3;


import java.util.Arrays;
import java.util.Scanner;

public class 큰_수의_법칙 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 개수
        int n = sc.nextInt();
        // 더하는 총 횟수
        int m = sc.nextInt();
        // 한 숫자가 반복 가능한 최대 횟수
        int k = sc.nextInt();

        // 입력받은 자연수의 집합
        int[] data = new int[n];
        for(int i = 0; i < data.length; i++){
            data[i] = sc.nextInt();
        }
        // 오름차 순으로 정렬
        Arrays.sort(data);

        int first_big_data = data[n-1];
        int second_big_data = data[n-2];

        // 수열이 반복되는 개수
        int repeat_cnt = m / (k+1);
        int first_big_data_cnt = m % (k+1) + (k * repeat_cnt);
        int second_big_data_cnt = repeat_cnt;
        int result = first_big_data * first_big_data_cnt + second_big_data * second_big_data_cnt;
        System.out.println(result);
    }
}

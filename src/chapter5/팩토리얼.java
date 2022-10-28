package chapter5;

public class 팩토리얼 {
    // 1부터 n 까지의 수를 차례대로 곱하기
    public static int factorialIterative(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    public static int factorialRecursive(int n){
        if(n == 1) return 1;
        return n * factorialRecursive(n-1);
    }
    public static void main(String[] args) {
        System.out.println("반복적으로 구현" + factorialIterative(5));
        System.out.println("재귀적으로 구현" + factorialRecursive(5));
    }
}

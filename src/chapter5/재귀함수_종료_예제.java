package chapter5;

public class 재귀함수_종료_예제 {
    public static void main(String[] args) {
        recursiveFunction(1);
    }
    public static void recursiveFunction(int i){
        if(i == 100) return;
        System.out.println(i + "번째 재귀 함수에서 " + (i + 1) + "번째 재귀함수를 호출합니다.");
        recursiveFunction(i + 1);
        System.out.println(i + "번째 재귀 함수를 종료합니다.");
    }
}

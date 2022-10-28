package chapter5;

public class 재귀함수_예제 {
    public static void main(String[] args) {
        recursiveFunction();
    }
    public static void recursiveFunction(){
        System.out.println("재귀 함수를 호출합니다.");
        recursiveFunction();
    }
}

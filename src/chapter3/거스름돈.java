package chapter3;

public class 거스름돈 {
    public static void main(String[] args) {
        int money = 1260;
        int moneyType[] = {500, 100, 50, 10};
        int count = 0;
        for(int i=0; i < moneyType.length; i++){
            count += money / moneyType[i];
            money %= moneyType[i];
        }
        System.out.println(count);
    }
}

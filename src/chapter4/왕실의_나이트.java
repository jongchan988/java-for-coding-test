package chapter4;

import java.util.Scanner;

public class 왕실의_나이트 {
    public static boolean isOver(int value){
        int max = 7;
        System.out.println(value);
        return value > max || value < 0;
    }
    public static void main(String[] args) {

        // 우 하 좌 상
        int[] dx = {-1, 1, 2, 2, 1, -1, -2, -2};
        int[] dy = {2, 2, 1, -1, -2, -2, 1, -1};
        int count = 0;

        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        char aChar = 'a';
        int y = (int)data.charAt(0) - (int)aChar;
        int x = (data.charAt(1) - '0') -1;
        for(int i = 0; i < dx.length; i++){
            int next_x = x + dx[i];
            int next_y = y + dy[i];
            if (isOver(next_x) || isOver(next_y)){
                continue;
            }
            count++;
        }
        System.out.println(count);
    }
}

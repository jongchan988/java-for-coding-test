package chapter4;

import java.util.Scanner;

public class 상하좌우 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 0;
        int max = 4;
        sc.nextLine();
        String []plans = sc.nextLine().split(" ");
        int x = 0;
        int y = 0;

        int[][]pan = new int[n][n];
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};
        for(int i = 0; i < plans.length; i++){
            char plan = plans[i].charAt(0);
            int next_x = 0;
            int next_y = 0;
            for(int j = 0; j < moveTypes.length; j++){
                if (moveTypes[j] == plan){
                    next_x = x + dx[j];
                    next_y = y + dy[j];
                }
            }
            if (next_x < min || next_y < min || next_x > max || next_y > max){
                continue;
            }
            x = next_x;
            y = next_y;
        }
        x = x+1;
        y = y+1;
        System.out.println(x + " " + y);
    }
}

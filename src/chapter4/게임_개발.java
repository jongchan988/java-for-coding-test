package chapter4;

import java.util.Scanner;

public class 게임_개발 {
    public static int getNextWay(int value){
        if (value == 0) return 3;
        return value - 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = sc.nextInt();

        int[]way = {0,1,2,3};
        int[]dx = {-1, 0, 1, 0};
        int[]dy = {0, 1, 0, -1};

        int[][]pan = new int[n][m];
        int[][]storage = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                pan[i][j] = sc.nextInt();
                storage[i][j] = 0;
            }
        }
        int turn_cnt = 0;
        int total_cnt = 1;
        storage[a][b] = 1;

        while (true){
            if (turn_cnt >= 4){
                int back_x = a - dx[d];
                int back_y = b - dy[d];

                if(pan[back_x][back_y] == 1){
                    break;
                }
                turn_cnt = 0;
                a = back_x;
                b = back_y;
                continue;
            }
            d = getNextWay(d);
            int next_x = a + dx[d];
            int next_y = b + dy[d];
            // 바다이거나 가본곳이면
            if (pan[next_x][next_y] == 1 ||  storage[next_x][next_y] == 1){
                turn_cnt += 1;
                continue;
            }
            turn_cnt = 0;
            storage[next_x][next_y] = 1;
            a = next_x;
            b = next_y;
            total_cnt ++;
        }
        System.out.println(total_cnt);
    }
}

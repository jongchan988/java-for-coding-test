package chapter5;

import java.util.Scanner;

public class 음료수_얼려_먹기 {
    public static int n, m;
    public static int[][] graph = new int[1000][1000];
    public static boolean dfs(int x, int y){
        if(overLimit(x, y) == true){
            return false;
        }

        if(wasVisited(x, y) == true){
            return false;
        }
        graph[x][y] = 1;
        // 위
        dfs(x - 1, y);
        // 아래
        dfs(x + 1, y);
        // 왼쪽
        dfs(x, y - 1);
        // 오른쪽
        dfs(x, y + 1);
        return true;
    }

    public static boolean overLimit(int x, int y){
        if (x < 0 || y < 0){
            return true;
        }

        return x >= n || y >= m;
    }

    public static boolean wasVisited(int x, int y){
        return graph[x][y] != 0;
    }

    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++){
            String str = sc.nextLine();
            for (int j = 0; j < m; j++){
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if(dfs(i,j) == true){
                 result++;
                }
            }
        }

        System.out.println(result);
    }
}

package chapter4;

import java.util.Scanner;

public class 왕실의_나이트_답안 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //현재 나이트의 위치 받기
        String inputData = sc.nextLine();
        int row = inputData.charAt(1) - '0';
        int column = inputData.charAt(0) - 'a' +1;

        // 나이트가 이동할 수 있는 8가지 방향 정의
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        //8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
        int result = 0;
        for(int i = 0; i < 8; i++){
            int nextRow = row + dx[i];
            int nextColumn = column + dy[i];

            if (nextRow >= 1 && nextRow <=8 && nextColumn >= 1 && nextColumn <=8){
                result += 1;
            }
        }
        System.out.println(result);
    }
}

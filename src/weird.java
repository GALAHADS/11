import java.util.Scanner;

public class weird {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열 행의 길이를 입력하세요: ");
        int size = sc.nextInt();

        int[][] array= new int[size][0];

        for(int i = 0 ; i < size ; i++) {
            System.out.printf("배열의 %d번째 열의 길이를 입력하세요: ");
            int length = sc.nextInt();
            array[i] = new int[length];
            System.out.printf("배열의 요소를 입력하세요: ");
            for (int j = 0; j < length ; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        //TODO: 각 행의 합을 계산해 출력하세요.
        //TODO: 각 열의 합을 계산해 출력하세요.
        // 해당하는 행의 열이 없는 경우, 0으로 처리합니다.
    }

}

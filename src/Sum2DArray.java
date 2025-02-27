
import java.util.Scanner;

public class Sum2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("2차원 배열의 크기를 입력하세요: ");
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            System.out.print((i + 1) + "번째 행의 정수를 입력하세요: ");
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int sum=0;
        for (int i = 0; i < row; i++) {
            for (int q = 0; q < column; q++) {
                sum += matrix[i][q];
            }
        }
        System.out.println(sum);
        // TODO: 2차원 배열의 합을 출력하세요.
    }
}

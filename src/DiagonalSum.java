
import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("2차원 배열의 크기를 입력하세요: ");
        int rowColumn = sc.nextInt();

        int[][] matrix = new int[rowColumn][rowColumn];

        for (int i = 0; i < rowColumn; i++) {
            System.out.print((i + 1) + "번째 열의 정수를 입력하세요: ");
            for (int j = 0; j < rowColumn; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int main=0,sub=0;
        for (int i = 0; i < rowColumn; i++) {
            for (int j = 0; j < rowColumn; j++) {
                if(i==j)
                    main += matrix[i][j];
                if((i+j)==(rowColumn-1))
                    sub += matrix[i][j];
            }
        }
        System.out.println(main+" "+sub);
        // TODO: 두 대각선의 합을 계산해 출력하세요.
    }
}

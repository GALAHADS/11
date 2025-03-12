
import java.util.Scanner;

public class StudentScores2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.print("배열의 요소를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("회전수를 입력하세요: ");
        int rotate = sc.nextInt();

        //TODO: 배열의 요소를 주어진 횟수만큼 오른쪽으로 회전시켜 출력하세요.
    }
}

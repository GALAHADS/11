import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("두 정수를 입력하세요 (공백으로 구분): ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

                // TODO: 두수의 합을 구합니다
                int result = num1 + num2;
                System.out.println("합: " + result);

                // TODO: 두수의 곱을 구합니다.
                result = num1 * num2;
                System.out.println("곱: " + result);
        }
    }
}

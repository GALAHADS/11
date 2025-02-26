import java.util.Scanner;

public class FormattedOutput {
    public static void main(String[] args) {
        double randomNumber = Math.random();
        System.out.println("생성된 난수: " + randomNumber);
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        // TODO: 정수를 입력 받습니다.
        int a = scanner.nextInt();
        System.out.printf("입력된 숫자는: [%10d]",a);
        // TODO: 요구 조건에 맞도록 출력합니다. 10자리, 오른쪽 정렬
        scanner.close();
    }
}

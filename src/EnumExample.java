import java.util.Scanner;

public class EnumExample {

    enum Season { SPRING, SUMMER, FALL, WINTER }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("계절을 입력하세요 (SPRING, SUMMER, FALL, WINTER): ");
        String season = scanner.nextLine();
        // TODO: 계절을 입력 받습니다.

        try {
            // TODO: 입력된 계절에 맞는 열거형을 찾습니다.
            Season.valueOf(season);
            System.out.println("입력한 계절은: " + season);
        } catch (IllegalArgumentException e) {
            // TODO: 입력된 계절이 없을 경우, IllegalArgumentException을 발생시킵니다.
            System.out.println("잘못된 계절입니다.");
        }

        scanner.close();
    }
}

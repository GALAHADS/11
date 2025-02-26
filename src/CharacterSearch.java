import java.util.Scanner;

public class CharacterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String a = scanner.nextLine();
        // TODO: 문자열 한줄을 입력 받습니다.
        System.out.print("검색할 문자를 입력하세요: ");
        // TODO: 검색할 문자를 입력 받습니다.
        String target = scanner.next();
        int position = a.indexOf(target); 
        // TODO: 문자열에서 주어진 문자를 찾습니다.

        if (position != -1) {
            System.out.println("문자 '" + target + "'의 위치: " + position);
        } else {
            System.out.println("문자 '" + target + "'는 문자열에 없습니다.");
        }

        scanner.close();
    }
}

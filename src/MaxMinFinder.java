import java.util.Scanner;

public class MaxMinFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int[] numbers = new int[sc.nextInt()];

        System.out.print("배열의 크기만큼 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        int max,min;       // TODO: 최소값, 최대값을 찾아 출력하세요.
        
    }
}

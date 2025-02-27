import java.util.Scanner;
import textio.TextIO;

public class n371 {
    public static void main(String[] args) {
        System.out.print("나이를 입력하세요: ");
        int age= TextIO.getlnInt();
P
        try {
            if(age < 0)
            throw new IllegalArgumentException(age+"는 나이가 아니다다");
            /* TODO:
             * 나이가 정상적으로 입력되었는지 확인하세요.
             * 음수로 입력된 경우, IllegalArgumentException을 발생시킵니다.
             * 이때, 입력된 정보를 포함한 메시지를 추가하세요.
             */
            System.out.println("나이: " + age);
        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생: " + e.getMessage());
        


}}}

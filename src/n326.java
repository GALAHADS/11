
import java.util.Scanner;

public class n326 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,sum = 0;
        while (true) { 
            System.out.print("숫자");
            a = sc.nextInt();
            if(a<0)
            break;
            sum += a;

        }
        System.out.println("합"+sum);
    }
}

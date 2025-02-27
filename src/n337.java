
import java.util.ArrayList;
import java.util.Scanner;

public class n337 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("숫자를 입력하세요요");
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int a;
        while (true) { 
            a = sc.nextInt();
            if(a == 0)
            break;
            nums.add(a);
        }
        System.out.print("짝수:");
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i)%2 == 0)
            System.out.print(nums.get(i)+" ");
        }
    }
    
}

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class Primes {
    private static final int SIZE = 1000;
    private static int size = SIZE;
    private static BitSet sieve = new BitSet(size);
    private static int last = 1;

    public static void setLast(int last){
        Primes.last = last;
    }	// last 설정
    public static void setLast(){
        last = 1;

    }	// last를 1로 설정
    public static void sizeSize(int size){
        sieve = new BitSet(size);
    } // 비트셋 크기 설정
    public static void sizeSize(){
        
    }	// 비트셋 크기를 1000으로 설정
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) { // √n까지 체크하면 최적화됨
            if (n % i == 0) return false;
        }
        return true;
    }	// n이 소수이면 true
    public static int next(){
        int a = last;
        boolean tf = false;
        while (true) { 
            a++;
            for (int i = 2; i * i <= last; i++) {
                while (last % i == 0) {  // 나누어 떨어지는 동안 반복
                    tf = true;
                    break;
                }
            }
            if(tf == true)
            break;
        }
        return a;

    }	// last 이후의 다음 소수
    public static void printPrimes(){


    }	// 체를 출력
    
    public static String factor(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("n must be greater than 1");
        }

        int prime = n;
        List<String> factors = new ArrayList<>();
        
        for (int i = 2; i  <= prime; i++) {  // i의 제곱이 prime보다 작거나 같을 때까지 반복
            while (prime % i == 0) {  // 나누어 떨어지는 동안 반복
                factors.add(Integer.toString(i));
                prime /= i;  // prime을 나눠줌
            }
        }
        
        if (prime > 1) {  // 마지막으로 남은 소수 추가
            factors.add(Integer.toString(prime));
        }

        return String.join("*", factors);  // 리스트 요소를 "*"로 연결
    }

    public static void checko() {
        int reverse, a;
        for (int i = 11; i < 10000; i++) {
            reverse = 0;
            a = i;

            while (a > 0) { // 숫자를 거꾸로 뒤집는 로직
                reverse = reverse * 10 + (a % 10);
                a = a / 10;
            }

            if (reverse == i && isPrime(reverse)) { // 뒤집어도 같은 수 & 소수 체크
                System.err.println(reverse);
            }
        }
    }


    public static void main(String[] args) {
        checko();
    }
}

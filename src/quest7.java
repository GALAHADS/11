import textio.TextIO;

public class quest7 {
    public static void main(String[] args) {

        System.out.println("이 프로그램은 지정한 시작 값을 사용하여 3N+1 시퀀스를 출력합니다.");
        System.out.println("시작 값을 입력해 주세요.");
        System.out.println();
  
        int K;   // 사용자가 지정한 시퀀스의 시작 지점.
        do {
           System.out.println("시작 값을 입력하세요;");
           System.out.print("프로그램을 종료하려면 0을 입력하세요: ");
           K = TextIO.getlnInt();  // 사용자로부터 시작 값을 받음
           if (K > 0)              // K가 0보다 클 때만 시퀀스를 출력
              print3NSequence(K);
        } while (K > 0);           // K가 0보다 클 때만 계속
  
     } // end main
  
     /**
      * print3NSequence는 시작 값(startingValue)을 사용하여
      * 3N+1 시퀀스를 표준 출력에 출력합니다. 또한 시퀀스의 항목 수를
      * 출력합니다. 매개변수 startingValue는 양의 정수여야 합니다.
      */
     static void print3NSequence(int startingValue) {
  
        int N;       // 시퀀스의 한 항목.
        int count;   // 찾은 항목의 개수.
        int onLine;  // 현재 줄에 출력된 항목의 수.
  
        N = startingValue;   // 시작 값을 사용하여 시퀀스를 시작
        count = 1;           // 현재까지 하나의 항목이 있음.
  
        System.out.println("3N+1 시퀀스의 시작 값: " + N);
        System.out.println();
        System.out.printf("%8d", N);  // 8자리로 초기 항목을 출력
        onLine = 1;        // 현재 출력 줄에 1개의 항목이 있음.
  
        while (N > 1) {
            N = nextN(N);  // 다음 항목 계산
            count++;       // 이 항목을 카운트
            if (onLine == 5) {  // 현재 출력 줄이 가득 찼다면
               System.out.println();  // ...줄 바꿈 수행
               onLine = 0;            // ...새 줄에 항목 없음
            }
            System.out.printf("%8d", N);  // 이 항목을 8자리로 출력
            onLine++;   // 이 줄에 출력된 항목 수에 1 추가
        }
  
        System.out.println();  // 현재 출력 줄 끝냄
        System.out.println();  // 빈 줄 추가
        System.out.println("시퀀스에는 총 " + count + "개의 항목이 포함되어 있습니다.");
  
     }  // end of print3NSequence
  
     /**
      * nextN은 현재 항목이 currentN일 때, 3N+1 시퀀스의
      * 다음 항목을 계산하여 반환합니다.
      */
     static int nextN(int currentN) {
         if (currentN % 2 == 1)
            return 3 * currentN + 1;
         else
            return currentN / 2;
     }
  
    
}

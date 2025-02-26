public class TaskTimer {
    public static void main(String[] args) {
        // TODO: 시작 시간 저장
        long a = System.nanoTime();

        // 작업: 1부터 100까지 출력
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        long b = System.nanoTime();

        System.out.println("작업 소요시간"+(b-a));
        // TODO: 종료 시간 저장
        // TODO: 소요 시간 계산
        // TODO: 소요 시간 출력
    }
}

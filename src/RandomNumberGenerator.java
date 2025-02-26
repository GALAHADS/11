public class RandomNumberGenerator {
    public static void main(String[] args) {
        // TODO: randomNumber가 0이상 100이하가 되도록 설정합니다.
        int randomNumber=(int)(Math.random()*100+1);
        System.out.println("생성된 난수: " + randomNumber);
    }
}

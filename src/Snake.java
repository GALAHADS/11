public class Snake {
    public static void main(String[] args) {
        int a,b,cnt = 0;
        while (true) {
            a= (int)(Math.random()*6+1); 
            System.err.println(a);
            b= (int)(Math.random()*6+1); 
            System.err.println(b);
            cnt++;
            if(a == 1 && b == 1)
            break;

        }
        System.err.println(cnt);
    }
    
}

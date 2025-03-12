public class biggest {
    public static void main(String[] args) {
        int big=0, sum=0,cnt;
        for (int i = 1; i < 10001; i++) {
            cnt = 0;
            for (int b = 1; b < i; b++){
             if((i%b) == 0)
                cnt++;
            }
            if(cnt > sum){
                sum = cnt;
                big = i;
            }

        } 
        System.out.println(big+" "+sum);
    }
    
    
    
    
}

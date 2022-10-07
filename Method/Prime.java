package Method;

public class Prime {
     int num=8;
    public static void main(String[] args) {
        IsPrime(77);
    }

    static void IsPrime(int num){
        
        int init;
        boolean set=false;
        for(init=1;init<=num;init++){
            if(num%init==0){
                set=true;
                
            }

        }
        if(!set){
            System.out.println("prime:"+num);
        }else
        System.out.println("Not prime:"+num);


    }
}

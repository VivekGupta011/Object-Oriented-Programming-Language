package Array;

public class EvenValueInArray {
    public static void main(String[] args) {
        int[] Array={3,45,56,24,60,77};
        int count=0;
        for(int ch :Array){
            if(ch%2==0){
                count++;
            }

        }
        System.out.println("number of event number:"+count);
    }
    
}

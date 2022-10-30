package Problem;

public class FindFirstevenThenOdd {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,8,9,15,14,16};
        EvenOddChecker(arr);
    }
    public static void EvenOddChecker(int[] arr){
        int[] NewArray=new int[arr.length];
        int index=0;
        // for even number
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                NewArray[index]=arr[i];
                index++;

            }
        }
        // for odd nuumber
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                NewArray[index]=arr[i];
                index++;

            }
        }
        // for printing array element
        for(int i=0;i<arr.length;i++){
            System.out.print(NewArray[i]+",");
        }
    }
    
}

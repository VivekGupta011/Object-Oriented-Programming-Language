package Problem;
public class PalindromeCheck {
    public static void main(String[] args) {
        String string=null;
        System.out.println("ans:"+PalindromeChecker(string));
    }
    public static boolean PalindromeChecker(String string){

        if(string!= null || string.length()==0){
            return false;
        }

        for(int i=0;i<string.length()/2;i++){
            char start=string.charAt(i);
            char end=string.charAt(string.length()-1-i);
            if(start!=end){
                return false;
            }
        }
        return true;
    }
    
    
}

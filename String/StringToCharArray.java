package String;

//for converting string to charArray we have two way
//1st way Using Naive Approach
// 2nd way Using toCharArray()

public class StringToCharArray {
    public static void main(String[] args) {
        String name="VivekGupta";
        char[] array=new char[name.length()];
        System.out.println(ArrayChar(array,name));    
        for(char ch:array){
            System.out.println(ch);
            
        }    

        // using tochararray()
        String namee="vivek";
        char[] ch=namee.toCharArray();
        System.out.println(array);
        for(char che:ch){

            System.out.println("this is array using tochararray:"+che);
        }
    }
    public static boolean ArrayChar(char[] array,String arr){
        for(int i=0;i<arr.length();i++){
            array[i]=arr.charAt(i);
        }
        return true;

        
        
    }
}

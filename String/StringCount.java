package String;

public class StringCount {
    public static void main(String[] args) {
        String name="vivek Gupta";
        int count=1;
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
            


        }
        System.out.println(count);
        
        System.out.println("Substring:"+name.substring(0, 6));

        // String are immutable
        name.concat("newVivek");
        System.out.println("updated:"+name);
         
    }
    
} 

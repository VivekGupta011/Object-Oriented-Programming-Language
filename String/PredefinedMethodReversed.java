package String;

public class PredefinedMethodReversed {
    public static void main(String[] args) {
        String name="Vivek Gupta";
        System.out.println("Original:"+name);
        StringBuffer Input=new StringBuffer();
        Input.append(name);
        System.out.println("Reversed:"+Input.reverse());
    }
    
}

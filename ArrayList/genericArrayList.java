package ArrayList;
import java.util.*;
//ArrayList having folloeing operation:-
// Adding element 
// changing element
// Removing element
// Iterating element

public class genericArrayList {
    public static void main(String[] args) {
        // Creating generic integer ArrayList
         ArrayList<String> Data = new ArrayList<String>();

        //  adding element
        Data.add("Geeks");
        Data.add("for");
        Data.add("Geeks");
        System.out.println("adding element:"+Data);

        //Adding the specifying the index to be added
        Data.set(2, "Vivek gupta");
        Data.remove(0);

        //using for loop getting data
        for(int i=0;i<Data.size();i++){
            System.out.print(Data.get(i)+" ");
        }
        System.out.println();

        //using the for each loop
        for(String str:Data){
            System.out.print(str+" ");
        }
        

    }
    
}

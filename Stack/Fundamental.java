package Stack;
import java.io.*;
import java.util.*;
public class Fundamental {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<Integer>();
        Stack<String> stack1=new Stack<String>();
        stack_push(stack);
        System.out.println(stack);
        stack_pop(stack);
        System.out.println("after popping:"+stack);
        // System.out.println("Peek:"+stack.peek());
        
        //pushing the elements
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack1.push("hello");
        stack1.push("hello");
        stack1.push("World");
        stack1.push("Hello vivek");
        System.out.println("stack:"+stack);
        System.out.println("stack1:"+stack1);

        // searching a element
        stack_check(stack, 4);
        stack_check(stack, 2);

        
        
    }

    // pushing element on the top of the stack
    static void stack_push(Stack<Integer> stack){
        for(int i=0;i<5;i++){
            stack.push(i);
        }
    }

    // Popping element from the top of hte stack
    static void stack_pop(Stack<Integer> stack){
        System.out.println("Pop Operation:");
        for(int i=0;i<5;i++){
            Integer y=(Integer) stack.pop();
            System.out.println("Popping element from top of stack:"+y);
           
        }
        System.out.println("Check stack:"+stack.empty());

    }

    // check value present in this array or not
    static void stack_check(Stack<Integer> stack,int elment){
        Integer pos=stack.search(elment);
        if(pos==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element is found at position:"+pos);
        }
        
    }
    
}

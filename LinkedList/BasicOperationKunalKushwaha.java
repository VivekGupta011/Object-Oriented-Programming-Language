package LinkedList;

import javafx.scene.Node;

public class BasicOperationKunalKushwaha {

    static Node head;
    static Node tail;
    private static int size;
    static class Node {
        int data;
        Node next;


        // constructor
        Node(int d) {
            data = d;
            next = null;
            size++;

        }
    }

    // insert first
    public static void AddFirst(int data){
        Node newNode=new Node(data);
        Node temp=head;
        if(temp==null){
            temp=newNode;
        }
        newNode.next=head;
        head=newNode;

    }

//    Add last
    public static void AddLast(int data){
        // new node
        Node new_node=new Node(data);
    
        // check empty and if yes then make new node as a head
        if(head==null){
            head=new_node;
        }else{
            Node last=head;
            while(last.next!=null){
                last=last.next;
            }
    
            // insert the new_node at last node
            last.next=new_node;
        }
        // return list;
        
       }


    //add node using custom index
    public static void CustomAdd(int data,int index){
        if(index==0){
            AddFirst(data);
            return;
        }
        if(index==size){
            AddLast(data);
            return;
        }

        Node secondlast=head;
        Node lastnode=head.next;
        for(int i=1;i<index;i++){
            secondlast=secondlast.next;
            lastnode=lastnode.next;
        }
        Node newNode=new Node(data);
        secondlast.next=newNode;
        newNode.next=lastnode;

    }


    // print the linkedlist
    public static void Print(){
        Node CurrNode=head;
        while(CurrNode!=null){
            System.out.print(CurrNode.data+"->");
            CurrNode=CurrNode.next;
        }
        System.out.println("End");

    }

    // return the size
    public static int Size(){
        return size;
    }
    public static void main(String[] args) {
        BasicOperationKunalKushwaha list=new BasicOperationKunalKushwaha();
        list.AddFirst(0);
        list.AddFirst(1);
        list.AddFirst(2);
        list.AddFirst(3);
        list.AddLast(5);
        list.AddLast(6);
        list.AddLast(7);
        Print();
        System.out.println("Size:"+Size());
        CustomAdd(9, 4);
        CustomAdd(10, 5);
        CustomAdd(11, 6);
        CustomAdd(12, 0);
        CustomAdd(13, 11);

        Print();
        System.out.println("Size:"+Size());
        
    }
    
}

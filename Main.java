import java.util.*;


class Node {
    public int data;
    public Node next;
    
    public Node(int data) {
        this.data = data;
    }
}


class Stack{
    private Node head;
    private int size;

    public Stack(){
        head = null;
        size = 0;
    }


    public boolean isEmpty(){
        return size == 0;
    }


    public void push(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
        size++;
    }


    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack está vazio!");
        }
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }


    public int returnHead(){
        if(isEmpty()){
            throw new RuntimeException("Stack está vazio!");
        }
        return head.data;
    }




}

public class Main{
    public static void main(String[] args){
        Stack stack = new Stack();
        Node head = new Node(1);
        stack.push(head.data);
        Node node1 = new Node(2);
        stack.push(node1.data);
        Node node2 = new Node(3);
        stack.push(node2.data);
        head.next = node1;
        node1.next = node2;
        node2.next = null;
        Node cur = head;
        while(cur != null){
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
}

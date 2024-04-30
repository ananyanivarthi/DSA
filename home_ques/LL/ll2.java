package home_ques.LL;

public class ll2 {
    public static void main(String[] args) {
    }
    private class Node{
        int data;
        Node next;
        public Node(int data, Node next) {
        }
        public Node() {

        }
    }
    private Node head;
    private Node tail;
    private int size;
    public int deletefirst(){
        int data = head.data;
        head = head.next;
        if(head ==null){
            tail = null;
        }
        size--;
        return data;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }



}

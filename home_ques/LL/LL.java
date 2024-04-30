package home_ques.LL;

import class_ques.LinkedList;

public class LL {
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

    public void addfirst(int data){
        Node nn = new Node();
        nn.data = data;
        if(size==0){
            head = tail = nn;
        }else{
            nn.next = head;
            head = nn;
        }
        size++;
    }
    public void addlast(int data){
        Node nn = new Node();
        nn.data = data;
        nn.next = null;
        if(size == 0){
            head=tail=nn;
        }
        else{
            tail.next = nn;
            tail = nn;
        }
    }
    public void nodeat(int data, int idx){
        if(idx == 0){
            addfirst(data);
            return;
        }
        if(idx==size){
            addlast(data);
            return;
        }
        Node temp = head;
        for(int i =0;i<idx;i++){
            temp = temp.next;
        }
        Node node= new Node(data,temp.next);

    }
    public int deletefirst(){
        int data = head.data;
        head = head.next;
        if(head ==null){
            tail = null;
        }
        size--;
        return data;
    }
    public Node get(int idx){
        Node node = head;
        for(int i = 0;i<idx;i++){
            node = node.next;
        }
        return node;
    }

    public int removelast(){
        if(size<=1){
            deletefirst();
        }
        Node secondlast = get(size-2);
        int data = tail.data;
        tail = secondlast;
        tail.next=null;
        return data;
    }

    public int remove(int idx){
        if(idx == 0){
            deletefirst();
        }
        if(idx == size-1){
            removelast();
        }
        Node prev = get(idx-1);
        int dat = prev.next.data;
        prev.next = prev.next.next;
        return dat;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+"->");
            temp = temp.next;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
//        l1.addFirst(3);
//        l1.addFirst(4);
//        l1.addFirst(5);
//        l1.addFirst(6);
//        l1.addFirst(7);
        l1.addLast(4);
        l1.addLast(45);
        l1.addLast(46);
        l1.addLast(44);
//        l1.removeLast();
//        l1.remove();
//        l1.display();


    }
}

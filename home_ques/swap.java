package home_ques;

public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
    }
    static void swap(int a , int b){
        int temp = a;
        a=b;
        b=temp;
    }
}

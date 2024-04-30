package home_ques;

import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int length = sc.nextInt();
        System.out.println("Enter breadth:");
        int breadth = sc.nextInt();
        int area = calculatearea(length,breadth);
        System.out.println(area);

    }
    public static int calculatearea(int length, int breadth){
       int area = length * breadth;
       return area;
    }

}

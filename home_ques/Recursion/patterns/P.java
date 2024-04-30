package home_ques.Recursion.patterns;

import java.util.Arrays;

public class P {
    public static void main(String[] args) {
//        p1(4,0);
//        p2(4,0);
    }
    public static void p2(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            p2(r,c+1);
            System.out.print("*");
        }
        else{
            p2(r-1,0);
            System.out.println();
        }
    }
    public static void p1(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            p1(r,c+1);
        }
        else{
            System.out.println();
            p1(r-1,0);
        }
    }


}

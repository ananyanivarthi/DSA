package home_ques;

import java.util.Scanner;

public class PR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount");
        float principalamt = sc.nextFloat();
        System.out.println("Enter rate");
        float rate = sc.nextFloat();
        System.out.println("Enter time period");
        float timeperiod = sc.nextFloat();
         simpleinterest(principalamt, rate, timeperiod);
    }
    public static void simpleinterest(float principalamt, float rate, float timeperiod){
        float si = (principalamt*rate*timeperiod)/100;
        System.out.println(si);
    }
}

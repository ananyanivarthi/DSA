package home_ques;

import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter home_ques.character");
        char a = sc.next().charAt(0);
        int result = Character(a);
        System.out.println(result);
    }
    public static int Character(char a){
        if (Character.isUpperCase(a)) {
            return 1;
        } else if (Character.isLowerCase(a)) {
            return 0;
        }
        else {
            return -1;
        }
    }
}

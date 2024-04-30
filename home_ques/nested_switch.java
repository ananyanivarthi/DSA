package home_ques;
import java.util.Scanner;
public class nested_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch(empID){
            case 1:
                System.out.println("Ananya");
                break;
            case 2:
                System.out.println("Nivarthi");
                break;
            case 3:
                switch(department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Manager":
                        System.out.println("Manager");
                        break;
                    default:
                        System.out.println("Enter correct dept");
                        break; 
                }
        }
    }

}

package home_ques.Patterns;

public class pattern {
    public static void main(String[] args) {
//        p1(4);
//        p2(4);
//        p3(5);
//        p4(5);
//        p6(5);
        p7(5);
    }

    public static void p2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void p1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void p3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void p4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static void p5(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static void p6(int n) {
        for (int row = 0; row <= 2*n; row++) {
            int totlacolsinrow = row>n?2*n-row:row;
            for(int col= 0;col<totlacolsinrow;col++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void p7(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totlacolsinrow = row > n ? 2 * n - row : row;
            int totalspace = n - totlacolsinrow;
            for (int s = 0; s < totalspace; s++) {
                System.out.print(" "); 
            }
            for (int col = 0; col < totlacolsinrow; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

package home_ques;

public class p1 {
    public static void main(String[] args) {
//        p1();
//          p2();
//        p3();
        p4();
    }

    public static void p1(){
        for(int i=0; i<4; i++){
            for(int j=1;j<5;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
    public static void p2(){
        int n=4;
        int m=5;
        for(int i=1; i<=n;i++){
            for(int j=1; j<=m;j++){
                if(i==1||j==1||i==n||j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void p3(){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void p4(){
        int n=4;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

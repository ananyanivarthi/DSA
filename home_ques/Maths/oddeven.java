package home_ques.Maths;

public class oddeven {
    public static void main(String[] args) {
        int n = 68;
        System.out.println(isodd(n));
    }
    public static boolean isodd(int n){
        return (n & 1) == 1;
    }
}

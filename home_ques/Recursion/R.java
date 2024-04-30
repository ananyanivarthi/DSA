package home_ques.Recursion;

public class R {
    public static void main(String[] args) {
        inc(5);
//        dec(5);
//        int ans = sum(1342);
//        int ans = prod(1342);
        int ans = coutzero(123,0);
        System.out.println(ans);
    }
    public static void inc(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        inc(n-1);
    }
    public static void dec(int n){
        if(n==0){
            return;
        }
        dec(n-1);
        System.out.println(n);
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sum(n/10);
    }
    public static int prod(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*prod(n/10);
    }
    public static int coutzero(int n, int c){
        if(n==0){
            return c;
        }
        int rem = n%10;
        if(rem == 0){
            return coutzero(n/10,c+1);
        }
        return coutzero(n/10,c);
    }
}

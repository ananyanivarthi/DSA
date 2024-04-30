package home_ques.Recursion;
import class_ques.Array;
import java.util.ArrayList;
import java.util.ArrayList;

public class rec {
    public static void main(String[] args) {
//        int[] arr = {2,3,2,3,4};
//        System.out.println(lastocc(arr,0,2));
//        ArrayList<String> res = getSS("abc");
//        System.out.println(res);
//        ArrayList<String> res = kpc("573");
//        System.out.println(res);
        kppc("678","");
        printdec(5);
//        printinc(5);
//        decinc(5);
//        int ans = fac(5);
//        System.out.println(ans);
//        int ans = power(2,5);
//        System.out.println(ans);
//        toh(3,"A","B","C");
//        int[] arr={10,20,30,40,0};
        int[] arr1={3,1,2,2,4};
//        disarr(arr,0);
//        disrevarr(arr,0);
//        int ans = firstocc(arr1,0,2);
//        System.out.println(ans);
        int ans = lastocc(arr1,0,2);
        System.out.println(ans);
//        int ans = findmax(arr, 0);
//        System.out.println(ans);
        int[] arr ={10,20,30,40,50};
        int target=20;
        System.out.println(bs(arr,target,0,arr.length- 1));
    }
    public static String[] codes={ ".;", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tu", "vwx", "yz"};
    public static int lastocc(int[] arr, int idx, int ele){
        if(idx==arr.length-1){
            return -1;
        }
        int li = lastocc(arr, idx+1,ele);
        if(li == -1){
            if(arr[idx]==ele){
                return idx;
            }else{
                return -1;
            }
        }else{
            return li;
        }
    }
    public static ArrayList<String> getSS(String s){
        if(s.length()==0){
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        char ch = s.charAt(0);
        String ros = s.substring(1);
        ArrayList<String> rres = getSS(s);
        ArrayList<String> myres = new ArrayList<>();
        for(String i:rres){
            myres.add(i);
            myres.add(ch+i);
        }
        return myres;
    }
    public static ArrayList<String> kpc(String a){
        if(a.length()==0){
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        char ch = a.charAt(0);
        String ros = a.substring(1);
        ArrayList<String> res = kpc(a);
        ArrayList<String> myres = new ArrayList<>();
        String code = codes[ch - '0'];
        for (int i = 0; i < code.length(); i++) {
            char chc = code.charAt(i);
            for (String val : res) {
                myres.add(chc + val);
            }
        }
        return myres;
    }
    public static void kppc(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String code = codes[ch - '0'];
        String roq=ques.substring(1);
        for(int i =0;i<code.length();i++){
            char chc=code.charAt(i);
            kppc(roq,ans+chc);
        }
    }
    public static void printdec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printdec(n-1);
    }
    public static void printinc(int n){
        if(n==0){
            return;
        }
        printinc(n-1);
        System.out.println(n);
    }
    public static void decinc(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        decinc(n-1);
        System.out.println(n);
    }
    public static int fac(int n){
        if(n<=1){
            return 1;
        }
        return n * fac(n-1);
    }
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }
    public static void toh(int n, String t1, String t2, String t3){
        if(n==0){
            return;
        }
        toh(n-1,t1,t3,t2);
        System.out.println(n+"["+t1 +"->"+t2);
        toh(n-1,t3,t2,t1);
    }
    public static void disarr(int[]arr,int idx){
        if(idx>arr.length-1){
            return;
        }
        System.out.println(arr[idx]);
        disarr(arr,idx+1);
    }
    public static void disrevarr(int[]arr,int idx){
        if(idx>arr.length-1){
            return;
        }
        disrevarr(arr,idx+1);
        System.out.println(arr[idx]);
    }
    public static int findmax(int[] arr, int idx){
        if(idx>arr.length-1){
            return -1;
        }
        int prevmax= findmax(arr, idx+1);
        return Math.max(arr[idx],prevmax);
    }
    public static int firstocc(int[] arr1,int idx, int ele){
        if(idx> arr1.length){
            return -1;
        }
        if(arr1[idx]==ele){
            return idx;
        }
        return firstocc(arr1,idx+1,ele);
    }
    public static int Lastocc(int[] arr1, int idx, int ele){
        if(idx== arr1.length){
            return -1;
        }
        int li = Lastocc(arr1,idx+1,ele);
        if(li==-1){
            if(arr1[idx]==ele){
                return idx;
            }
            else{
                return -1;
            }
        }
        else {
            return li;
        }
    }
    public static int bs(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[m]>target){
            return bs(arr,target,s,m-1);
        }
        return bs(arr,target,m+1,e);
    }
}

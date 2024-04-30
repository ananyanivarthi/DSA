package home_ques.Recursion.array;

import java.util.ArrayList;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4};
        int target = 3;
//        System.out.println(find(arr,target,0));
//        int ans = findindx(arr,target,0);
//        System.out.println(ans);
//        findallindx(arr,target,0,new ArrayList<>());
//        System.out.println(findallindx(arr,target,0,new ArrayList<>()));
        System.out.println(returnllindx(arr,target,0));
    }
    public static boolean find(int[]arr,int target,int idx){
        if(idx == arr.length){
            return false;
        }
        return arr[idx] == target|| find(arr,target,idx+1);
    }
    public static int findindx(int[]arr, int target, int idx){
        if(idx== arr.length-1){
            return -1;
        }
        if (arr[idx]==target) {
            return idx;
        }
        else {
            return findindx(arr,target,idx+1);
        }
    }
    static ArrayList<Integer>  list = new ArrayList<>();
    public static ArrayList<Integer> findallindx(int[]arr, int target, int idx,ArrayList<Integer>  list){
        if(idx== arr.length-1){
            return list;
        }
        if (arr[idx]==target) {
            list.add(idx);
        }
         return findallindx(arr, target, idx+1,list);
    }
    public static ArrayList<Integer> returnllindx(int[]arr, int target, int idx){
        ArrayList<Integer> list = new ArrayList<>();
        if(idx== arr.length-1){
            return list;
        }
        if (arr[idx]==target) {
            list.add(idx);
        }
        ArrayList<Integer> ans= returnllindx(arr, target, idx+1);
        list.addAll(ans);
        return list;
    }

}

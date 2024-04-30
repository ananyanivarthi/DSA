package home_ques;

public class tss {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        Tss(arr,0,0,"",60);
    }
    public static void Tss(int[]arr, int idx, int csum,String set, int target){
        if(idx == arr.length){
        if(csum==target){
            System.out.println(set);
        }}
        //include
        Tss(arr,idx+1,csum+arr[idx],set+arr[idx]+" ",target);
        //exclude
        Tss(arr, idx+1, csum, set, target);
    }
}

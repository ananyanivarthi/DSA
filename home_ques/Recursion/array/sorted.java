package home_ques.Recursion.array;

public class sorted {
    public static void main(String[] args) {
        int[] arr={1,2,9,4,5};
        System.out.println(Sorted(arr,0));
    }
    public static boolean Sorted(int[]arr, int idx){
        if(idx==arr.length-1){
            return true;
        }
        return arr[idx]<arr[idx+1]&&Sorted(arr,idx+1);
    }
}

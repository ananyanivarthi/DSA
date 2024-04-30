package home_ques;

public class sqno {
    public static void main(String[] args) {
        int[] arr = {0,1,2};
//        sq(arr);
        cube(arr);
    }
    public static void sq(int[] arr){
        for(int i=0;i<arr.length;i++){
           int square = arr[i]*arr[i];
            System.out.println(square);
        }
    }
    public static void cube(int[] arr){
        for(int i=0;i<arr.length;i++){
            int square = arr[i]*arr[i]*arr[i];
            System.out.println(square);
        }
    }
}

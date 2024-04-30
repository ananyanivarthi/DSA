package home_ques;

public class array {
    public static void main(String[] args) {
        int[] arr = {6,7,8,4,1};
        int num=4;
        int index = Search(arr, num);
        if (index != -1) {
            System.out.println("Element " + num + " found at index " + index);
        } else {
            System.out.println("Element " + num + " not found in the array.");
        }
    }
    public static int Search(int[] arr, int num){
        for(int i=0; i< arr.length; i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
}

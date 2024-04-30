package home_ques.sorting;

import java.util.Arrays;

public class missingno {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(missingno(arr));
    }
    public static int missingno(int[] arr){
        int i=0;
        while(i< arr.length){
            int correct = arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                return index;
            }

        }
        return arr.length;
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }
}

import java.util.*;
public class bubblesort{
    public static void main(String[] args){
        int[] arr={4,5,6,8,5,2};
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=1+i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}

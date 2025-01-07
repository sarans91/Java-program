import java.util.*;
public class productarray {
    public static void  main(String[] args){
        int[] arr={1,5,6,2,4};
        int[] arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int product=1;

            for(int j=0;j<arr.length;j++){
                if(arr[i]!=arr[j]){
                    product*=arr[j];
                }
            }
            arr2[i]=product;
        }
        System.out.println(Arrays.toString(arr2));
    }
}

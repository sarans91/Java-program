import java.util.*;
public class array {
    public static void main(String[] main){
        Scanner obj=new Scanner(System.in);
        int size =obj.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        for(int i =0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int j=size-1;j>=0;j--){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        int even=0;
        int odd=0;
        int count2=0;
        int count=0;
        for(int k=0;k<=size-1;k++) {
            if (arr[k]%2==0){
                count++;
                even+=arr[k];

            }else{
                count2++;
                odd+=arr[k];
            }


        }
        System.out.println("Count os even="+count +" "+even);
        System.out.println(" Count of odd="+count2+" " +odd);


    }
}

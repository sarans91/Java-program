import java.util.*;
public class diamondpattern {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
            for(int i=2;i<=n;i++){
                for(int j=1;j<=2*(i-1);j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k<=2*(n-i)+1; k++) {
                    System.out.print("*"+" ");
                }
                System.out.println();

            }




    }

}



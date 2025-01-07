public class majoryitofarray {
    public static void main(String[] args){
        int [] arr={1,1,1,2,3};



        int len=arr.length;
        int maxcount=0;
        int majelement=0;

        for(int i=0;i<len;i++) {
            int count = 0;

            for (int j = 0; j < len; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }
            if (count > maxcount) {
                maxcount = count;
                majelement = arr[i];
            }


        }
        if (maxcount > len / 2) {
            System.out.print(majelement);
        } else {
            System.out.println("no maj element");
        }

        }

    }


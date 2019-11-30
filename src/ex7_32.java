import java.util.Arrays;
import java.util.Scanner;

public class ex7_32 {
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
        System.out.println("Enter list:");
        int range = in.nextInt();

        int [] list = new int[range];

        int [] copy = new int[list.length];

        for (int i = 0 ;i<list.length;i++){
            list[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(list));

        int index = partition(list,copy);


        System.out.println(Arrays.toString(copy));



    }


    public static int partition(int[] list,int[]copy){



        int j = 0;
        int k = copy.length-1;
        for (int i =1;i<list.length;i++){
            if (list[0] > list[i]){
                copy[j] = list[i];
                j++;
            }else if (list[0] < list[i]){
                copy[k] = list[i];
                k--;
            }
        }

        for (int l = j ; l<=k;l++){
            copy[l] = list[0];
        }

        return j;
    }
}

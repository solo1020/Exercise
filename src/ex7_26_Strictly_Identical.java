import java.util.Scanner;

public class ex7_26_Strictly_Identical {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter list1:");
        int range1 = in.nextInt();
        int [] list1 = new int[range1];
        for (int i = 0 ; i<list1.length;i++){
            list1[i] = in.nextInt();
        }

        System.out.println("Enter list1:");
        int range2 = in.nextInt();
        int [] list2 = new int[range2];
        for (int i = 0 ; i<list2.length;i++){
            list2[i] = in.nextInt();
        }

        if (equals(list1,list2)){
            System.out.println("Two lists are strictly identical");
        }else {
            System.out.println("Two lists are not strictly identical");
        }

    }

    public static boolean equals(int[] list1,int[] list2){
        for(int i = 0; i< list1.length;i++){
            if (list1[i] != list2[i]){
                return false;
            }
        }
        return true;
    }

}

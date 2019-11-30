package DataStructure;

public class LoopAndRecurrence {
    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        recurrencePrint(100);
        Long end = System.currentTimeMillis();
        System.out.println( (end-start)/1000);

    }


    public static void LoopPrint(int n){
        for (int i = 0 ; i < n ; i++){
            System.out.println(i);
        }
    }

    public static void recurrencePrint(int n){
        recurrencePrint(n-1);
        System.out.println(n);
    }
}

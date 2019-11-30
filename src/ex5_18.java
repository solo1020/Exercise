public class ex5_18 {
    public static void main(String[] args) {
        final int num = 6;
        for(int i = 1; i <= num; i++){
            for (int j = num-i;j>0;j--){
                System.out.print("  ");
            }
            for (int n = i; n>=1;n--){
                System.out.print(n+ " ");
            }
            System.out.println();
        }
    }
}

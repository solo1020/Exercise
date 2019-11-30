public class ex5_18_1 {
    public static void main(String[] args) {
        final int num = 6;
        for (int i = num; i >0; i--){
            for (int n = 0;n < num-i;n++){
                System.out.print("  ");
            }
            for (int j = 1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

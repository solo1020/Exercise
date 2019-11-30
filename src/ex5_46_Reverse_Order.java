import java.util.Scanner;

public class ex5_46_Reverse_Order {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String s = input.nextLine();
        char exchange;
        String reverse = "";
        for (int i =0;i<s.length();i++){

            reverse = reverse + s.charAt(s.length()-1-i) ;
        }
        System.out.println("The String after reverse is: "+ reverse);
    }
}

import java.util.Scanner;

public class ex5_47 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter the first 12 digits if an ISBN-13 as a string: ");
        String s = input.nextLine();
        int last = 10 - ( s.charAt(0)+3*s.charAt(1) + s.charAt(2) + 3*s.charAt(3) +
                s.charAt(4) + 3*s.charAt(5) + s.charAt(6) + 3*s.charAt(7)+
                s.charAt(8) + 3*s.charAt(9) + s.charAt(10) + 3*s.charAt(11) )%10;
        last = last % 10;
        System.out.println(last);
        System.out.println((int)s.charAt(0));
        String l = String.valueOf(last);
        s = s + l;
        System.out.println("The ISBN-13 number is " + s);
    }
}

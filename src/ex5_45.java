
import java.util.Scanner;

public class ex5_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers : ");
        double average = 0;
        double total = 0;
        double n = 0;
        double variance = 0;
        for(int i = 0; i< 10;i++){
            n = input.nextDouble();
            variance = variance + Math.pow(n,2);
            total = total + n;
        }
        average = total / 10;
        variance = Math.pow( (variance-Math.pow(total,2)/10)/(10-1),0.5);

        System.out.println("The mean is "+average);
        System.out.println("The standard deviation is "+variance);
    }

}

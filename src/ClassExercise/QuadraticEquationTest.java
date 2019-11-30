package ClassExercise;

import java.util.Scanner;

public class QuadraticEquationTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the a, b, c:");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a,b,c);

        if (qe.getDiscriminant() > 0){
            System.out.println("The two roots of this equation are: "
                    +qe.getRoot1()+" "+qe.getRoot2());
        }else if (qe.getDiscriminant() == 0){
            System.out.println("The root of the equation is: "+qe.getRoot2());
        }else{
            System.out.println("The equation has no roots");
        }
    }
}

package ClassExercise;

public class FinallyTest {
    public static void main(String[] args) {
        try{
            int [] list = new int[10];
            System.out.println(list[10]);
            System.out.println("The statements in try ");
        }
        catch (ArithmeticException ex){
            System.out.println("The ArithmeticException statement");
        }
        catch (IndexOutOfBoundsException ex){
            System.out.println("The IndexOutOfBoundsException statement");
        }
        catch (Exception ex){
            System.out.println("The Exception statement");
        }
        finally {
            System.out.println("The finally statement");
        }
        System.out.println("The statement after finally");
    }

}

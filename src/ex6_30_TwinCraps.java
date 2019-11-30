public class ex6_30_TwinCraps {
    public static void main(String[] args) {
        crapsGame();
    }
    public static void crapsGame(){
        int number = throwCraps();
        int secondNumber = 0;
        if (number == 2 ||
            number == 3 ||
            number == 12 ){
//            System.out.println("You rolled ");
            System.out.println("You lose");
            return;

        }else if (number == 7 ||
                number == 11 ){
            System.out.println("You win");
            return;
        }else {
            System.out.println("Point is "+ number);

            // while 里的 || 条件 要想跳出，需要全满足，&& 条件才是有一个满足即可
            while (secondNumber != number &&
                    secondNumber != 7 )
             {
                secondNumber = throwCraps();
            }
            if (secondNumber == number ){
                System.out.println("You win");
                return;
            }else {
                System.out.println("You lose");
                return;
            }

        }
    }

    public static int throwCraps(){
        int firstThrow = (int)(Math.random()*6+1);
        int secondThrow = (int)(Math.random()*6+1);
        System.out.println("You rolled "+firstThrow+ " + "+secondThrow +" = "+ (firstThrow+secondThrow));
        return firstThrow+secondThrow;
    }

}

package Exception_FileIO;

public class Calculator_7_9 {
    public static void main(String[] args) {
        if (args.length != 3){
            System.out.println(
                    "Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        int result = 0;

        switch (args[1].charAt(0)){
            case '+':
                result = Integer.parseInt(args[0])+
                                Integer.parseInt(args[2]);
                break;
            case '-':
                result = Integer.parseInt(args[0]);

                break;
            case '.':

                break;
            case '/':

                break;
        }
    }
}

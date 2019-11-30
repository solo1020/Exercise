//package ClassExercise;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DeleteString {
    public static void main(String[] args) throws IOException {
        if (args.length != 3){
            System.out.println("Usage: java DeleteString String filename");
        }

        File sourecFile = new File(args[1]);

        if (!sourecFile.exists()){
            System.out.println("Sourefile does not exist");
        }

        try(
                Scanner in = new Scanner(sourecFile);
                PrintWriter out = new PrintWriter(args[2]);
                ){
            while (in.hasNext()){
                String s1 = in.nextLine();
                String s2 = s1.replaceAll("John","");
                System.out.println("s2 is now :" +s2);
                out.println(s2);
            }
        }
    }

}

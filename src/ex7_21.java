public class ex7_21 {
    public static void main(String[] args) {

    }

    public static void fallBalls(int numOfBalls,int slots){
        int [] list = new int[slots];

        for (int i:list){
            System.out.println("The ball's path is "+ path(8) );
            ballsPosition(path(8),list);
        }

        printBalls(list);


    }

    public static String path(int slots){
        String path = "";

        double dr = 0;
        for (int i = 0 ;i<slots-1;i++){
            dr = Math.random();
            if(dr > 0.5){
                path = path +'R';

            }else {
                path = path + 'L';

            }
        }
        return path;
    }

    public static void printBalls(int [] list){
        for (int i = 0 ; i<list.length;i++){
            for (int j = 0; j<list.length;j++){
                if (list[j] == 0){
                    System.out.println("\t");
                }
            }
        }
    }

    public static void ballsPosition(String path,int [] list){
        int leftCount = 0;
        int rightCount = 0;
        for (int i = 0;i<path.length();i++){
            if (path.charAt(i)== 'R'){
                rightCount++;
            }else {
                leftCount++;
            }
        }
        int initPosition = 1 ;
        int index = 3 - (leftCount - rightCount -initPosition)/ 2 ;
        list[index]++;
        System.out.println("The ball falls into the "+index+" number of slot");

    }


}

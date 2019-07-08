import java.util.Scanner;


public class ex7_21 {
    public static void main(String[] args) {
		//创建输入
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of balls to drop:");
		
		//获取落球的个数
		int numOfBalls = in.nextInt();
		System.out.println("Enter the number of slots in the bean machine:");
		
		//获取槽的数量
		int slots = in.nextInt();
		fallBalls(numOfBalls,slots);
    }

	//模拟落球机
    public static void fallBalls(int numOfBalls,int slots){
		
		//创建一个槽的数组，用来存储落在每个槽中的球的数量
        int [] list = new int[slots];
		
		//球的路径的字符串
		String ballPath = "";

        for (int i = 0 ; i<numOfBalls;i++){
			
			//将每次落球的路径存储下来
			ballPath = path(slots);
            System.out.println("The ball's path is "+ ballPath );
			
			//根据存储的球的路径字符串，获取球落在哪个槽，并存到数组中
            ballsPosition(ballPath,list);
		}
		
		//打印最后得到的装满球的槽数组
        printBalls(list);


    }

	// 模拟球的路径，返回这个球路径的字符串
    public static String path(int slots){
        String path = "";

        double dr = 0;
        for (int i = 0 ;i<slots;i++){
			
			//根据随机数来区分球往左还是往右
            dr = Math.random();
            if(dr > 0.5){
                path = path +'R';

            }else {
                path = path + 'L';

            }
        }
        return path;
    }
	
	//打印最后得到的装满球的槽数组
    public static void printBalls(int [] list){
		
		//每个元素作为一行，进行递增
        for (int i = 0 ; i<list.length;i++){
			
			//每个元素代表垂直位置
            for (int j = 0; j<list.length;j++){
				
				//这一列的位置没有球，则打印 * 号
                if (list[j] == 0){
                    System.out.print("*");
					
				//这一列的位置有球，且球的个数list[j]满足 行数打印的位置
                }else if ( list[j] != 0 && i >= list.length-list[j]){
					System.out.print("o");
				}else {
				
				//垂直位置有球，但没到水平的行数，也不打印
					System.out.print("*");
				}
            }
			System.out.println();
        }
    }
	
	//根据存储的球的路径字符串，获取球落在哪个槽，并存到数组中
    public static void ballsPosition(String path,int [] list){
		//往左的次数
        int leftCount = 0;
        int rightCount = 0;
        for (int i = 0;i<path.length();i++){
            if (path.charAt(i)== 'R'){
                rightCount++;
            }else {
                leftCount++;
            }
        }
		
		//初始位置设置为第四个槽，即 leftCount - rightCount = 1
		//之后球往左或者往右，相应 的leftCount 和rightCount 会同时+1 和 -1
        int initPosition = 1 ;
		
		//归纳法得知，这个式子就能得到槽位置的索引
        int index = 3 - (leftCount - rightCount -initPosition)/ 2 ;
		
		//存储球到槽数组
        list[index]++;
		
		//打印这个球下落到哪个槽，方便调试错误
        System.out.println("The ball falls into the "+index+" number of slot");

    }


}

package ClassExercise;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(){
        long nowTime = System.currentTimeMillis();
        //毫秒取余得到当前的秒数
        second = (int)(nowTime % (60*1000)/1000);
        //
        minute = (int)( nowTime % (60 * 60 * 1000)/(60*1000) );
        //获取的是格林尼治时间，需加8小时
        hour = (int)(  nowTime%(24 * 60 * 60 * 1000 )/(60*60*1000))+8;
        System.out.println(" now is: "+ hour+ " : "+ minute+ " : "+ second);
    }
}

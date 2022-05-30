package search;

import engine.Constants;


public class TimeUtil {

    private static long start_time;
    private static long TimeMax = 10000;
    private static boolean running = false;
    private static long runningTime = 0;

    /* đặt lại thời gian nghĩ */
    public static void setThinkingTime(int time){
        TimeMax = time;
    }

    /* Bắt đầu chạy chương trình */
    public static void start(){
        running = true;
        start_time = System.currentTimeMillis();
    }

    public static void end(){
        running = false;
        runningTime = System.currentTimeMillis() - start_time;
    }

    /* Thời gian nghĩ đã hết */
    public static boolean isTimeLeft(){
        if(Constants.ENABLE_COUNT) Constants.ThinkingTime = TimeUtil.getTime();
        return System.currentTimeMillis() - start_time > TimeMax;
    }

    /* Lấy thời gian đã nghĩ */
    public static long getTime(){
        return running ? System.currentTimeMillis() - start_time : runningTime;
    }
}

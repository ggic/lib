package com.snoweagle.console.common.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.time.DateFormatUtils;

import java.util.Date;

/**
 * 运行时间分析
 * @author pw
 */
@Slf4j
public class TimeAnalysis {
    /**
     * 返回以毫秒为单位的当前时间
     * 
     * @return
     */
    public static long currentTimeMillis(String text) {
        long current = System.currentTimeMillis();
        log.info( "{}>>>>=========== 开始时间 : {}" ,text, DateFormatUtils.format(new Date(current),"yyyy/MM/dd HH:mm:ss"));
        return current;
    }

    /**
     * 获取处理时间
     * 
     * @param lastMile 前执行时间
     * @return 秒
     */
    public static long getProcessingTime(long lastMile) {
        return System.currentTimeMillis() - lastMile;
    }

    /**
     * 打印处理时间
     * 
     * @param lastMile 前执行时间
     * @param text
     */
    public static void printProcessingTime(long lastMile, String text) {

        long pt = getProcessingTime(lastMile);
        float minutes = Float.valueOf(pt) / (1000 * 60);
        float seconds = Float.valueOf(pt) / 1000;
        log.info( "{} <<<<=========== 执行时间： {} 分钟 , {} 秒 , {} 毫秒",text,minutes,seconds,pt);
    }

    public static void main(String[] args) throws InterruptedException {
        long now = currentTimeMillis("【 申购 】");
        printProcessingTime(now, "【 申购 】");
    }
}

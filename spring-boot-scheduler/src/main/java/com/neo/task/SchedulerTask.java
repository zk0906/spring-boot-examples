package com.neo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * 创建定时任务实现类
 * @Scheduled 参数可以接受两种定时的设置，一种是我们常用的cron="* * * * * ?",一种是 fixedRate = X，两种都表示每隔X秒打印一下内容。
 */
@Component
public class SchedulerTask {

    private int count=0;

    @Scheduled(cron="*/6 * * * * ?")//{秒数} {分钟} {小时} {日期} {月份} {星期} {年份(可为空)}
    private void process(){
        System.out.println("this is scheduler task runing  "+(count++));
    }

}

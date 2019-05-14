package task.mytask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;
import thread.mythread.MyThread;

import javax.annotation.Resource;

/**
 * Project Name:spring-pool
 * File Name:MyTask
 * Package Name:task.mytask
 * Date:2019/5/13
 * Author:liujie
 * Description:
 * Copyright (c) 2019, 重庆云凯科技有限公司 All Rights Reserved.
 */


@Component
public class MyTask {

    private static final Logger logger = LoggerFactory.getLogger(MyTask.class);

    @Resource(name = "taskExecutor")
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    public void process() {
        for (int i = 0; i < 55; i++) {
            MyThread myThread = new MyThread(i);
            threadPoolTaskExecutor.execute(myThread);
            logger.info("线程池中线程数目：" + threadPoolTaskExecutor.getPoolSize() + ",线程中等待执行的" +
                    "任务数目：" + threadPoolTaskExecutor.getActiveCount());
        }
    }
}

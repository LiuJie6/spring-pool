package thread.mythread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Project Name:spring-pool
 * File Name:MyThread
 * Package Name:thread.mythread
 * Date:2019/5/13
 * Author:liujie
 * Description:
 * Copyright (c) 2019, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class MyThread implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(MyThread.class);

    private int num;

    public MyThread(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        logger.info("开始执行第" + num + "个线程");
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            logger.error("错误信息：" + e.getMessage());
        }
        logger.info("第" + num + "个线程执行完毕");
    }
}

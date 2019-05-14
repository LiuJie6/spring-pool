package service.pool.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.pool.api.IPoolService;
import task.mytask.MyTask;

/**
 * Project Name:spring-pool
 * File Name:PoolServiceImpl
 * Package Name:service.pool.impl
 * Date:2019/5/13
 * Author:liujie
 * Description:
 * Copyright (c) 2019, 重庆云凯科技有限公司 All Rights Reserved.
 */

@Service("poolService")
public class PoolServiceImpl implements IPoolService{

    @Autowired
    private MyTask myTask;

    @Override
    public void testPool() {
        this.myTask.process();
    }
}

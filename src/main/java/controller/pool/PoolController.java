package controller.pool;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.pool.api.IPoolService;

import javax.annotation.Resource;

/**
 * Project Name:spring-pool
 * File Name:PoolController
 * Package Name:controller.pool
 * Date:2019/5/13
 * Author:liujie
 * Description:
 * Copyright (c) 2019, 重庆云凯科技有限公司 All Rights Reserved.
 */


@RestController("poolController")
@RequestMapping("/pool")
public class PoolController {

    @Resource(name = "poolService")
    private IPoolService poolService;

    @RequestMapping("/test")
    public void testPool(){
        this.poolService.testPool();
    }
}

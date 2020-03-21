/**
 * 文件名：ServiceDomeImpl.java
 * <p>
 * Copyright 2019 重庆若谷信息技术有限公司 版权所有.
 */
package com.example.demo.service.impl;

import com.example.demo.service.ServiceDome;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.*;

/**
 *
 * @author zhuxin
 * @date 2019/11/18 14:47
 * @since 1.0.0
 */
@Service
public class ServiceDomeImpl implements ServiceDome {

    class SexCompare{
        String orederCode;
    }

    @Override
    public Map<String, Object> demoTest(String orederCode) {
        SexCompare sexCompare = new SexCompare();
        sexCompare.orederCode = orederCode;

        return null;
    }

    //存放请求   线程安全
    LinkedBlockingQueue queue = new LinkedBlockingQueue<>();

    /**定时任务 ---相当于servlet的init()*/
    @PostConstruct
    public void init(){
        /**建立定时任务*/
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        /**0--执行延迟  10--定时重复*/
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {

            }
        },0,10, TimeUnit.MILLISECONDS);
    }
}

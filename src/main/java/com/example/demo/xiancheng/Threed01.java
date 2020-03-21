/**
 * 文件名：Threed01.java
 * <p>
 * Copyright 2019 重庆若谷信息技术有限公司 版权所有.
 */
package com.example.demo.xiancheng;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author zhuxin
 * @date 2019/11/18 14:04
 * @since 1.0.0
 */

public class Threed01 {



    public static void main(String[] args) {

        /**普通开启异步线程*/
        new Thread(() -> {
            System.out.println("--" + "aaa");
        }).start();


    }

}

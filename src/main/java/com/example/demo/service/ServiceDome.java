/**
 * 文件名：ServiceDome.java
 * <p>
 * Copyright 2019 重庆若谷信息技术有限公司 版权所有.
 */
package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.Map;

/**
 *
 * @author zhuxin
 * @date 2019/11/18 14:46
 * @since 1.0.0
 */

public interface ServiceDome {

    Map<String,Object> demoTest(String orederCode);


}

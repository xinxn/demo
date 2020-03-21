 /**   
 * 文件名：Test1.java
 *     
 * Copyright 2019 重庆若谷信息技术有限公司 版权所有.   
 *   
 */
package com.example.demo.contorller;

/**
 * 
 * @author zhuxin
 * @date 2019年9月29日
 * @since 1.0.0 
 */
public class Test1 {
    //递归  1+...+100
    public static void main(String[] args) {
        System.out.println(sum(2));
    }
    public static int sum(int i) {
        if (i == 1) {
            return 1;
        }
        return sum(i - 1) + i;
    }
}

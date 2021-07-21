package com.bjpowernode;

import redis.clients.jedis.Jedis;

/**
 * 张杰
 * 2021/7/1
 */
public class App4 {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        String name = jedis.get("username");
        System.out.println(name);
    }
}

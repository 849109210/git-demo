package com.bjpowernode;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.HashMap;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {
        JedisPool pool = null;
        try {
            pool = RedisUtils.open("127.0.0.1", 6379);
            Jedis jedis = pool.getResource();
            jedis.set("k", "20");
            String k = jedis.get("k");
            System.out.println(k);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            RedisUtils.close();
        }

    }
}

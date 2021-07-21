package com.bjpowernode;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App2 {
    public static void main(String[] args) {
        JedisPool pool = null;
        try {
            pool = RedisUtils.open("127.0.0.1", 6379);
            Jedis jedis = pool.getResource();

            Map<String,String> map = new HashMap<>();
            map.put("zhangsan", "15");
            map.put("lisi", "20");
            map.put("wangwu", "25");
            jedis.hmset("student", map);
            String hget = jedis.hget("student", "lisi");
            System.out.println(hget);

            List<String> hmget = jedis.hmget("student", "zhangsan", "lisi", "wangwu");
            for (String s : hmget) {
                System.out.println(s);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            RedisUtils.close();
        }
    }
}

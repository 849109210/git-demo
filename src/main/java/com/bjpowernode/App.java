package com.bjpowernode;

import redis.clients.jedis.Jedis;

public class App 
{
    public static void main( String[] args )
    {

       Jedis jedis = new Jedis("127.0.0.1",6379);
       jedis.flushAll();
       jedis.set("zhangsan", "15");
       jedis.set("username", "lisi");
       String name = jedis.get("username");
       String zhansgan = jedis.get("zhangsan");
        System.out.println(name);
       System.out.println(zhansgan);
    }
}

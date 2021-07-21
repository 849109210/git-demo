package com.bjpowernode;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtils {
  public static JedisPool pool = null;

  public static JedisPool open(String host,int port){
      if (pool == null){
          JedisPoolConfig config = new JedisPoolConfig();
          //设置最大连接数
          config.setMaxTotal(10);
          //设置空闲连接数
          config.setMaxIdle(2);
          pool = new JedisPool(config,host,port);
      }
      return pool;
  }

  public static void close(){
      if (pool!=null){
          pool.close();
      }
  }
}

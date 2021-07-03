package com.bjpowernode.test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.Set;

/**
 * qy
 * 2021/7/1
 */
public class App {
    public static void main(String[] args) {
        JedisPool pool = RedisUtils.getPool("127.0.0.1", 6379);
        Jedis jedis = pool.getResource();
        jedis.set("127.0.0.1", "127.0.0.1");
        jedis.zadd("x",80.8,"xiaohong");
        jedis.zadd("x", 1, "xiaowang");
        Set<String> x = jedis.zrevrange("x", 0, 3);
        for (String s : x) {
            System.out.println(s);
        }
        RedisUtils.close();
    }
}

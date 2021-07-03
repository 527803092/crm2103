package com.bjpowernode;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class App1
{
    public static void main( String[] args )
    {
       /* JedisPool pool=null;
       try{
           pool=RedisUtils.open("127.0.0.1",6379);
           Jedis jedis=pool.getResource();
           jedis.flushAll();
           jedis.set("str1","aaa");
           String str1=jedis.get("str1");
           System.out.println(str1);
       }catch (Exception e){
           e.printStackTrace();;
       }finally{
           RedisUtils.close();
       }*/
        try {
            JedisPool pool = RedisUtils.getJedisPool("127.0.0.1", 6379);
            Jedis jedis = pool.getResource();
            String user = jedis.get("user");
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            RedisUtils.close();
        }
    }
}

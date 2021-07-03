package com.bjpowernode;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App2
{
    public static void main( String[] args )
    {
        /*JedisPool pool=null;
       try{
           pool=RedisUtils.open("127.0.0.1",6379);
           Jedis jedis=pool.getResource();
           jedis.flushAll();
           jedis.hset("hset1","str1","abc");
           String str1=jedis.hget("hset1","str1");
           System.out.println(str1);
           System.out.println("------------------------------------");

           Map<String,String> map=new HashMap <>();
           map.put("id","a001");
           map.put("name","zs");
           map.put("age","22");
           jedis.hmset("student",map);
           List<String> sList=jedis.hmget("student","id","name","age");
           for(String str:sList){
               System.out.println(str);
           }
       }catch (Exception e){
           e.printStackTrace();;
       }finally{
           RedisUtils.close();
       }*/
        JedisPool pool = RedisUtils.getJedisPool("127.0.0.1", 6379);
        Jedis jedis = pool.getResource();
        Map<String,String> map = new HashMap<>();
        map.put("name", "niaho");
        map.put("name1", "niaho");
        jedis.hmset("myhset", map);
        List<String> hmget = jedis.hmget("myhset", "name","name1");
        for (String s : hmget) {
            System.out.println(s);
        }
        RedisUtils.close();
    }
}

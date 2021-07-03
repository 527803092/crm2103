package com.bjpowernode;

import redis.clients.jedis.Jedis;

public class App 
{
    public static void main( String[] args )
    {

        /*Jedis jedis=new Jedis("127.0.0.1",6379);
        //删除所有db
        jedis.flushAll();
        jedis.set("str1","aaa");
        String str1=jedis.get("str1");
        System.out.println(str1);
        jedis.append("str1","bbb");
        String str2=jedis.get("str1");
        System.out.println(str2);*/
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.flushAll();
        jedis.set("user", "tom");
        String user = jedis.get("user");
        System.out.println(user);
    }
}

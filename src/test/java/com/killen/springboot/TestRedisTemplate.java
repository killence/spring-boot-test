package com.killen.springboot;

import com.killen.springboot.entity.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName TestRedisTemplate
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-05
 * @Version V1.0
 **/
@SpringBootTest
public class TestRedisTemplate {

    @Resource
    private RedisTemplate redisTemplate;

    @Test
    public void testRedis(){
        redisTemplate.opsForValue().set("killen","123");
        Assert.assertEquals("123", redisTemplate.opsForValue().get("killen"));
    }
    @Test
    public void testObj(){
        User user=new User("ityouknow@126.com", "smile", "youknow", "know","2020");
        ValueOperations<String, User> operations=redisTemplate.opsForValue();
        operations.set("com.neo", user);
        User u=operations.get("com.neo");
        System.out.println("user: "+u.toString());
    }

    @Test
    public void testExpire() throws InterruptedException {
        User user = new User("ityouknow@126.com", "smile", "youknow", "know","2020");
        ValueOperations<String,User> operations = redisTemplate.opsForValue();
        //给key设置时间100毫秒
        operations.set("expire",user,100, TimeUnit.MILLISECONDS);
        Thread.sleep(1000);
        //判断key值存不存在
        Boolean expire = redisTemplate.hasKey("expire");
        if(expire){
            System.out.println("exists is true");
        }else{
            System.out.println("exists is false");
        }
        Boolean aBoolean = redisTemplate.hasKey("123");
        System.out.println(aBoolean);
    }

    @Test
    public void deleteKey(){
        //redisTemplate.opsForValue().set("name","abc");
        //删除键值
        redisTemplate.delete("name");
        Boolean name = redisTemplate.hasKey("name");
        if(name){
            System.out.println("exists is true");
        }else{
            System.out.println("exists is false");
        }
    }

    //操作Hash
    @Test
    public void hashTest(){
        HashOperations<String,Object,Object> hashOperations = redisTemplate.opsForHash();
        //hash名，key，value
        hashOperations.put("hash","username","killen");
        String username = (String)hashOperations.get("hash", "username");
        System.out.println(username);
    }

    //操作list
    @Test
    public void listTest(){
        ListOperations<String,String> listOperations = redisTemplate.opsForList();
        listOperations.leftPush("list","2");
        listOperations.leftPush("list","1");
        listOperations.leftPush("list","0");
        listOperations.leftPush("list","0");
        List<String> list = listOperations.range("list", 0, -1);
        System.out.println(list);
    }

    //操作Set
    @Test
    public void setTest(){
        SetOperations<String,String> setOperations = redisTemplate.opsForSet();
        setOperations.add("set","1");
        setOperations.add("set","1");
        setOperations.add("set","2");
        setOperations.add("set","3");
        Set<String> set = setOperations.members("set");
        for (String s : set) {
            System.out.println(s);
        }
    }

    //Sort Set操作
    @Test
    public void sort_setTest(){
        ZSetOperations<String,String> zSetOperations = redisTemplate.opsForZSet();
        zSetOperations.add("user","username",1);
        zSetOperations.add("user","lastname",2);
        zSetOperations.add("user","age",0);
        Set<String> user = zSetOperations.range("user", 0, -1);
        for (String s : user) {
            System.out.println(s);
        }
    }
}

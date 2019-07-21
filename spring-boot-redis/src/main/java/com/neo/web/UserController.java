package com.neo.web;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.model.User;

import javax.servlet.http.HttpSession;
import java.util.UUID;

@RestController
public class UserController {

    /**
     * 如何在查找数据库的时候自动使用缓存？
     * @Cacheable 自动根据方法生成缓存
     * 其中 value 的值就是缓存到 Redis 中的 key
     * @return
     */
    @RequestMapping("/getUser")
    @Cacheable(value="user-key")
    public User getUser() {
        User user=new User("aa@126.com", "aa", "aa123456", "aa","123");
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
    }


    /**
     * 测试session共享  获取sessionId
     * @param session
     * @return
     */
    @RequestMapping("/uid")
    String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }
}

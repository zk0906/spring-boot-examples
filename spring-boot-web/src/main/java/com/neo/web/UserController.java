package com.neo.web;

import com.neo.model.User;
import com.neo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Controller ：需要使用页面开发只要使用此注解即可
 * @RestController ：使用json接口时使用此接口=@Controller+@ResponseBody
 */
@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

    @RequestMapping("/getUser")
    public User getUser() {
    	User user=userRepository.findByUserName("aa");
    	System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
    }

    @RequestMapping("/getUsers")
    public List<User> getUsers() {
    	List<User> users=userRepository.findAll();
    	System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return users;
    }
}

package com.neo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * todo   http://www.ityouknow.com/springboot/2017/06/26/spring-boot-shiro.html
 *
 *
 *测试
 * 1、编写好后就可以启动程序，访问http://localhost:8080/userInfo/userList页面，由于没有登录就会跳转到http://localhost:8080/login页面。登录之后就会跳转到 index 页面，登录后，直接在浏览器中输入http://localhost:8080/userInfo/userList访问就会看到用户信息。上面这些操作时候触发MyShiroRealm.doGetAuthenticationInfo()这个方法，也就是登录认证的方法。
 *
 * 2、登录admin账户，访问：http://127.0.0.1:8080/userInfo/userAdd显示用户添加界面，访问http://127.0.0.1:8080/userInfo/userDel显示403没有权限。上面这些操作时候触发MyShiroRealm.doGetAuthorizationInfo()这个方面，也就是权限校验的方法。
 *
 * 3、修改 admin不 同的权限进行测试
 *
 * Shiro 很强大，这仅仅是完成了登录认证和权限管理这两个功能，更多内容以后有时间再做探讨。
 *
 *
 *
 */
@SpringBootApplication
public class ShiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShiroApplication.class, args);
	}
}

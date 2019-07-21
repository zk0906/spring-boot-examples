package com.neo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 无配置文件注解版：就是一切使用注解搞定。
 */
@SpringBootApplication
@MapperScan("com.neo.mapper")//或者在每个Mapper 类上面添加注解@Mapper
public class MybatisAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisAnnotationApplication.class, args);
	}
}

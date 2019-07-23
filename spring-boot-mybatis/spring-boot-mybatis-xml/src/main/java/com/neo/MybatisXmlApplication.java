package com.neo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 这个版本为通用版本
 * 极简xml版本保持映射文件的老传统，接口层只需要定义空方法，系统会自动根据方法名在映射文件找到对应的sql
 *
 */
@SpringBootApplication
@MapperScan("com.neo.mapper")
public class MybatisXmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisXmlApplication.class, args);
	}
}

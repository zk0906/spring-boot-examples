package com.neo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * 共享 Session
 * 分布式系统中，Session 共享有很多的解决方案，其中托管到缓存中应该是最常用的方案之一，
 * Spring Session 提供了一套创建和管理 Servlet HttpSession 的方案。Spring Session 提供了集群 Session（Clustered Sessions）功能，默认采用外置的 Redis 来存储 Session 数据，以此来解决 Session 共享的问题。
 * 如何在两台或者多台中共享 Session:在另一个项目使用同样的配置，可以实现Session共享
 */
@Configuration
//maxInactiveIntervalInSeconds: 设置 Session 失效时间，使用 Redis Session 之后，原 Spring Boot 的 server.session.timeout 属性不再生效。
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400*30)//
public class SessionConfig {
}

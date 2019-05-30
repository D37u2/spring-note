package com.zz.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @EnableAspectJAutoProxy 使用Java配置启用@AspectJ支持，spring boot中不需要配置，只需添加spring boot aop 包即可
 *
 * @ComponentScan 配置注解扫描路径。spring boot 中可以不配置
 */

@Configuration
@ComponentScan("com")
@EnableAspectJAutoProxy
public class Spring {
}

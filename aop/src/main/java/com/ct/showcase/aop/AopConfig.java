package com.ct.showcase.aop;

import com.ct.showcase.ioc.IocConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.ct.showcase")
/*
 * @EnableAspectJAutoProxy 注解主要有以下几个作用：
 * 开启AOP支持：它告诉Spring容器开启对AspectJ的自动代理功能，这样Spring就可以自动地为被@Aspect注解的类创建代理对象。
 * 自动代理：Spring AOP 通过代理模式来实现切面逻辑的织入。使用这个注解，Spring会自动为那些被@Aspect注解的类创建代理对象，而不需要开发者手动编写代理逻辑。
 * 配置代理类型：@EnableAspectJAutoProxy 注解中的 proxyTargetClass 参数是一个布尔值，用于指定代理的类型。当设置为 true 时，表示使用 CGLIB 库来为目标类创建一个子类作为代理。这样做的好处是，即使目标类没有实现接口，也可以被代理。而当设置为 false（默认值）时，Spring AOP 会使用 JDK 动态代理，这要求目标类必须实现至少一个接口。
 * 织入切面：一旦代理创建完成，Spring AOP 就会根据配置的切点（Pointcut）和通知（Advice）织入相应的切面逻辑。
 * 使用 @EnableAspectJAutoProxy(proxyTargetClass = true) 可以确保即使目标对象没有实现接口，Spring AOP 也能够通过CGLIB为其创建代理，从而实现切面逻辑的织入。这对于某些不能使用JDK动态代理的场景非常有用。
 */
@EnableAspectJAutoProxy(proxyTargetClass = true)
/*
 * @Import 注解用于将一个或多个配置类导入到 Spring 容器中。它帮助将 Bean 定义从不同的配置类中组合在一起，便于管理和使用。
 */
@Import(IocConfig.class)
public class AopConfig {
}

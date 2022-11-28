package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *@SpringBootapplication 메타 어노테이션
 * 
 * +@SpringVootConfiguration	:cf.@Cinfiguration->2x01,ex2
 * +@ComponetScan				:ex04 패키지의 하부 패키지 스캐닝을 한다.
 * +@EnableAutoConfiguration	:
 * 		1. MVC, AOP, Security, JPA 등을 자동설정 "디폴트"(미세설정 필수) 설정
 * 		2. 발견된 Stater Dependebcy(Library) 기반으로 설정한다.
 * 
 */

@SpringBootConfiguration
public class MyApplication {
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args)){}
	}
}
package org.zh.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

//让spring容器启动时，不自动配置数据源
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}
}

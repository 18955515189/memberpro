package cn.itcast.member;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	@Bean
	public Queue sms_queue(){
		return new ActiveMQQueue("itcast.sms");
	}
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);

	}

}

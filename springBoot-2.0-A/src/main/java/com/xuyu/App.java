package com.xuyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ���ǵڶ���������ʽ ����ɨ�� <br>
 * SpringBoot ��Ŀ ������Ͼ�̬��Դ ͼƬ��css��js֮��
 * 
 */
// @ComponentScan("com.xuyu.controller")
// @EnableAutoConfiguration
@SpringBootApplication
public class App {

	/**
	 * 
	 * // @SpringBootApplication
	 * ��ͬ��@EnableAutoConfiguration+ @ComponentScan("com.itmayiedu") 
	 * <br>
	 * ע�⣺@SpringBootApplication ɨ����Χ����ͬ�����͵�ǰ����
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}

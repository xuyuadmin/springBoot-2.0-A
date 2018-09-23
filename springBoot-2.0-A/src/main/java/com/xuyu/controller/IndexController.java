package com.xuyu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * �������� ��һ��SpringBoot��Ŀ <br>
 */
@RestController
// @EnableAutoConfiguration
public class IndexController {

	// ��΢��������������϶������ϼ���@RestController Ŀ�ģ�
	// ʹ�ô�ͳ��ʽ����json @ResponseBody
	// @RestController ���ε����µ����з�����ȫ�����Ƿ���josn��ʽ,�����Ļ������ڷ����ϼ���@ResponseBody
	@RequestMapping("/index")
	public String index() {
		return "xuyu";
	}

//	// ˼������������� ʹ��main����
//	// @EnableAutoConfiguration ���� �����Զ�װ��
//	public static void main(String[] args) {
//		// ����SpringBoot ������� Ĭ�϶˿ں���8080
//		SpringApplication.run(IndexController.class, args);
//	}

}

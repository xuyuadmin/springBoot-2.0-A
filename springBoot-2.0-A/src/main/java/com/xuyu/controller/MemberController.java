package com.xuyu.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这是我们第 二个 Controller<br>
 */
@RestController
public class MemberController {

	@RequestMapping("/getMember")
	public Map<String, Object> getMember() {
		Map<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("errorCode", 200);
		hashMap.put("errorMsg", "错误");
		return hashMap;
	}

}

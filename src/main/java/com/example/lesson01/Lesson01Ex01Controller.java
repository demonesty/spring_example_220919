package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/ex01")
@Controller // 스프링빈(Spring bean)
public class Lesson01Ex01Controller {

	// String 출력하기 - content type HTML
	// http://localhost:8080/lesson01/ex01/1
	@ResponseBody // 리턴되는 값을 HTML Response body에 넣어 보낸다.
	@RequestMapping("/1") // 주소 매핑
	public String printString() {
		String text = "예제 1번<br>문자열을 response body로 보내는 예제";
		return text;
	}

	// Map 출력하기
	// http://localhost:8080/lesson01/ex01/2
	@ResponseBody
	@RequestMapping("/2")
	public Map<String, Object> printMap() {
		// {"aaaa"=1111, "bbbb"=2222...}
		Map<String, Object> map = new HashMap<>();
		map.put("aaaa", 1111);
		map.put("bbbb", 2222);
		map.put("cccc", 3333);
		map.put("dddd", 4444);
		
		// spring web starter 때문에 jackson이라는 라이브러리가 포함되어있음.
		return map; // map을 리턴하면 JSON으로 나타난다.
	}

}

package com.eagle;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * 模板测试.
 * 
 * @author Administrator
 * 
 * 
 * 
 */

@Controller
public class TemplateController {
	/**
	 * 
	 * 返回html模板.
	 * 
	 */

	@RequestMapping("/helloHtml")
	public String helloHtml(Map<String, Object> map) {

		map.put("hello", "from TemplateController.helloHtml");
		return "/helloHtml";
	}
	
	@GetMapping("/eagle")
	public ModelAndView showName() {
		ModelAndView mView = new ModelAndView();
		mView.setViewName("eagle");
		mView.addObject("name", "eagle");
		return mView;
	}
}
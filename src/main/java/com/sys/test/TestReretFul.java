package com.sys.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bigData.fanal.mapper.TestMapper;

@Scope("prototype")
@Controller
@RequestMapping("/test")
public class TestReretFul {
	
	@Autowired
	TestMapper testMapper ;
	/**
	 * 测试方法,HelloWord
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String getProducts(HttpServletRequest request,HttpServletResponse response) throws Exception {

		request.setAttribute("name", "helloWord");
		List<Map> list = testMapper.select("1");
		System.out.println("------》》你好！"); 
		return "test/hello";

	}

	@RequestMapping(value={"/info/{pid}"},method=RequestMethod.GET)
	public ModelAndView getProductInfo(@PathVariable String pid, HttpServletRequest request,HttpServletResponse response) throws Exception {

		Map<String,Object> map = new HashMap<String,Object>();

		map.put("name", "hello json");
		System.out.println("------》》你好 hello json ！"); 
		ModelAndView mav=new ModelAndView("test/info",map);

		return mav;

	}
}

package com.sys.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bigData.system.bean.SysUser;
import com.bigData.system.mapper.SysUserMapper;
import com.github.pagehelper.PageHelper;

@Scope("prototype")
@Controller
@RequestMapping("/test")
public class TestReretServiceFul {
	
	@Autowired
	SysUserMapper sysUserMapper ;
	/**
	 * 测试方法,HelloWord
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String getProducts(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("sysUserMapper" +sysUserMapper ); 
		
		SysUser sysUser = new SysUser();
		sysUser.setUserId("111");
		sysUser.setUserName("tom");
		sysUser.setCreateDate("20160605");
		sysUser.setCreateTime("08:30:11");
		sysUser.setLastSignDate("20160605");
		sysUser.setLastSignTime("08:30:11");
		sysUser.setPassword("123456");
		
		sysUserMapper.insert(sysUser);

		sysUser.setLastSignDate("20160606");
		sysUserMapper.updateBySelective(sysUser);
		
	    sysUser = sysUserMapper.selectByPrimaryKey(sysUser.getUserId());
	    sysUserMapper.deleteByPrimaryKey(sysUser.getUserId());
// 		List<Map> list = testMapper.select("1");
	
		System.out.println("sysUser------》》你好！" + sysUser.getUserName()); 
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
	public String page( )   {
		SysUser sysUser = new SysUser();
	    List<SysUser> list = sysUserMapper.query(sysUser,new RowBounds(2,3));
		return "";

	}
}

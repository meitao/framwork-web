package com.bigData.common;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.bigData.system.mapper.SysUserMapper;
import com.sys.test.TestReretServiceFul;

public class SpringTest extends BaseTest {
	
	private static Logger log = LoggerFactory.getLogger(SpringTest.class);   
	@Autowired
	SysUserMapper sysUserMapper ;
	@Autowired
	TestReretServiceFul testReretServiceFul ;
	@Test
	public void insert(){  
		try {
//			testReretServiceFul.getProducts(null, null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		SysUser sysUser = new SysUser();
		sysUser.setUserId("111");
		sysUser.setUserName("tom");
		sysUser.setCreateDate("20160605");
		sysUser.setCreateTime("08:30:11");
		sysUser.setLastSignDate("20160605");
		sysUser.setLastSignTime("08:30:11");
		sysUser.setPassword("123456");
		
		sysUserMapper.insert(sysUser);*/
	} 
	@Test
	public void query(){  
		testReretServiceFul.page();
	}
}

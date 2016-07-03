package com.bigData.common;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={ "file:src/test/resources/config/applicationContext.xml"/*"classpath:applicationContext.xml"*/})  
public abstract  class BaseTest {
	@Before  
	//一些公用的“初始化”代码  
	public void before(){  
	}  
}

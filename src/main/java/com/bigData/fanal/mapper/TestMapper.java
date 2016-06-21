package com.bigData.fanal.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public interface TestMapper {
	
	public List<Map> select(String ss);  
	
	public int insert(Map param);  
	
	public int updaqte(Map param); 
	
	public int delete(int user_id);  
}

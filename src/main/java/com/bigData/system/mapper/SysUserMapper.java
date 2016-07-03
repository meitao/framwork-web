package com.bigData.system.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import com.bigData.system.bean.SysUser;
@Repository
public interface SysUserMapper {
	
    int deleteByPrimaryKey(String userId);

    void insert(SysUser record);

    SysUser selectByPrimaryKey(String userId);
    
    List<SysUser> query(SysUser sysUser ,  RowBounds   rowBounds );
    
    void updateBySelective(SysUser sysUser);
    
}
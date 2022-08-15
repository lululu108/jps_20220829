package com.example.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.example.demo.member_master.DesignUser;
import com.example.demo.member_master.DesignUserForm;
import com.example.demo.mmRegister.mmRegister;

@Mapper
public interface DesignUserMapper {
	List<DesignUser> selectAll();
	
	void insert_order_tran(mmRegister design);
}

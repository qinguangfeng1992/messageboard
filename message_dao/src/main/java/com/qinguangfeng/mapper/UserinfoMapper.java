package com.qinguangfeng.mapper;



import com.qinguangfeng.entity.Userinfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserinfoMapper {

	public List<Userinfo> searchUser(Userinfo userinfo);

	public  Userinfo searchUserTwo(@Param("userName") String userName, @Param("usePwd") String usePwd);

}

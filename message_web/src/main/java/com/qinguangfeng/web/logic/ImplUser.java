package com.qinguangfeng.web.logic;

import com.qinguangfeng.entity.Userinfo;
import com.qinguangfeng.mapper.UserinfoMapper;
import com.qinguangfeng.mapper.Util;

/**
 * Created by Administrator on 2016/9/14.
 */
public class ImplUser implements UserLogic {
private UserinfoMapper userinfoMapper;

public ImplUser(){

    userinfoMapper= Util.getUserinfoMapper();

}
    @Override
    public Userinfo login(String name, String pwd) {

       Userinfo u= userinfoMapper.searchUserTwo(name,pwd);

        return u;
    }

}

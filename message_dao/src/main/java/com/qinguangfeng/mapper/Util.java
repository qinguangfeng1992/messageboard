package com.qinguangfeng.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * Created by Administrator on 2016/9/14.
 */
public class Util {

    private static SqlSession session;
    private static SqlSessionFactory sqlSessionFactory=null;

    static {
        try {
            Reader reader = Resources.getResourceAsReader("config.xml");
             sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            session = sqlSessionFactory.openSession();
        } catch (Exception e) {
            e.printStackTrace();

        }


    }


    public  static UserinfoMapper getUserinfoMapper() {
        return session.getMapper(UserinfoMapper.class);


    }

    public static MessageboardMapper getMessageboardMapper() {
        return session.getMapper(MessageboardMapper.class);


    }

    public static void  closeSession(){
        session.close();
    }
    public static void  getCommit(){session.commit(); }
    public static void  getRollback(){
        session.rollback();
    }


}

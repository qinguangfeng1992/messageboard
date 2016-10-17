import com.qinguangfeng.mapper.MessageboardMapper;
import com.qinguangfeng.mapper.UserinfoMapper;
import com.qinguangfeng.entity.Messageboard;
import com.qinguangfeng.entity.Userinfo;
import com.qinguangfeng.mapper.Util;
import com.qinguangfeng.vo.MessageboardVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Administrator on 2016/9/14.
 */
public class TestMessage {

    UserinfoMapper userinfoMapper;
    MessageboardMapper messageboardMapper;
    SqlSession session;

    @Before
    public void init() {
        try {
            Reader reader = Resources.getResourceAsReader("config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            session = sqlSessionFactory.openSession(true);


            messageboardMapper = session.getMapper(MessageboardMapper.class);
            userinfoMapper = session.getMapper(UserinfoMapper.class);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Test
    public void s(){
         Userinfo u=new Util().getUserinfoMapper().searchUserTwo("xiaobai","123");
        System.out.println(u.getUserName()+u);
    }
    @Test
    public void searchUser() {
        Userinfo userinfo = new Userinfo();


        List<Userinfo> list = userinfoMapper.searchUser(userinfo);
        for (Userinfo u : list) {

            System.out.println(u.getUserName());

        }
    }

    @Test
    public void insertMsg() {
        Messageboard messageboard = new Messageboard();
        messageboard.setBoardId(UUID.randomUUID().toString());
        messageboard.setMessageContext("我喜欢小米！！");
        messageboard.setReceiveuserId(2);
        messageboard.setSenduserId(1);

        messageboardMapper.insertMsg(messageboard);

    }

    @Test
    public void deleteMsg() {


        messageboardMapper.deleteMsg("f463d94f-b9c2-4f01-8422-92e4c6baeb07");

    }

  /*  @Test
    public void searchMsgById() {

        Map map = new HashMap();
        //  map.put("boardId",2);
        map.put("receiveuserId", 1);

        List<Messageboard> list = messageboardMapper.searchMsgById(map);
        for (Messageboard m : list) {
            System.out.println(m.getMessageContext());
        }
    }*/

    @Test
        public void searchMsgId() {

        Map map = new HashMap();
        //  map.put("boardId",2);
        map.put("receiveuserId",1);

        List<MessageboardVo> list = messageboardMapper.searchMsgById(map,1);
        for (MessageboardVo m : list) {
            System.out.println(m.getSendUsername()+"发送了消息！");
        }
    }
    @Test
    public void testgetTotalCount() {

      int count=  messageboardMapper.getTotalCount(1);
        System.out.println(count);
    }


}

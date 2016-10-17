import com.qinguangfeng.entity.Messageboard;
import com.qinguangfeng.entity.Userinfo;
import com.qinguangfeng.vo.MessageboardVo;
import com.qinguangfeng.web.logic.ImplMessage;
import com.qinguangfeng.web.logic.ImplUser;
import com.qinguangfeng.web.logic.UserLogic;
/*import junit.framework.Assert;*/
import org.junit.Test;

import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2016/9/20.
 */
public class Testyewu {


@Test
    public void testAdd(){
    ImplMessage implMessage=new ImplMessage();

    Messageboard messageboard=new Messageboard();
    messageboard.setMessageContext("测试一下业务逻辑");
    messageboard.setBoardId(UUID.randomUUID().toString());
    messageboard.setReceiveuserId(1);
    messageboard.setSenduserId(2);
    implMessage.sendMessage(messageboard);

}

    @Test
    public void testFind(){
        ImplMessage implMessage=new ImplMessage();

       /* List<Messageboard> list=implMessage.findMyMessage(2);*/
        List<MessageboardVo> list=implMessage.findMyMessage(2);

        for(MessageboardVo m:list){

            System.out.println(m.getReceiveuserId()+":"+m.getMessageContext());
        }


    }

   /* @Test
    public void testDenglu(){
        UserLogic userLogic=new ImplUser();

       Userinfo u= userLogic.login("xiaobai", "123");
        Assert.assertNull(u);//断言U是空的
        Assert.assertNotNull(u);//断言U不是空的

        //System.out.println(u);

    }*/

    @Test
    public void testfindMyMessage(){
        ImplMessage implMessage=new ImplMessage();

       /* List<Messageboard> list=implMessage.findMyMessage(2);*/
        List<MessageboardVo> list=implMessage.findMyMessage(2,4);

        for(MessageboardVo m:list){

            System.out.println(m.getSendUsername()+"发送了:"+m.getMessageContext());
        }

    }

    @Test
    public void testgetTotalCount(){
        ImplMessage implMessage=new ImplMessage();
int pages=implMessage.getTotalCount(1);
        System.out.println("总页数"+pages);

    }




}

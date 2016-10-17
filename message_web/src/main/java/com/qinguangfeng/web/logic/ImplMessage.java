package com.qinguangfeng.web.logic;

import com.qinguangfeng.entity.Messageboard;
import com.qinguangfeng.mapper.MessageboardMapper;
import com.qinguangfeng.mapper.Util;
import com.qinguangfeng.vo.MessageboardVo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/20.
 */
public class ImplMessage implements MessageBoardLogic {
    MessageboardMapper messageboardMapper;
    public ImplMessage(){
        messageboardMapper= Util.getMessageboardMapper();
    }


    @Override
    public void sendMessage(Messageboard messageboard) {
        try {
            messageboardMapper.insertMsg(messageboard);
            Util.getCommit();


        } catch (Exception e) {
            e.printStackTrace();
            Util.getRollback();
        }finally {
            Util.closeSession();
        }
    }

    @Override
    /*public List<Messageboard> findMyMessage(int receiveId) {
        Map map=new HashMap();
        map.put("receiveuserId",receiveId);
        return messageboardMapper.searchMsgById(map);
    }*/

    public List<MessageboardVo> findMyMessage(int receiveId) {
        Map map=new HashMap();
        map.put("receiveuserId",receiveId);
        return messageboardMapper.searchMsgById(map,null);
    }

    @Override

    public List<MessageboardVo> findMyMessage(int receiveId,int pages) {
        Map map=new HashMap();
        map.put("receiveuserId",receiveId);
        int startrow=(pages-1)*3;
        return messageboardMapper.searchMsgById(map,null);
    }

    @Override
    public int getTotalCount(int receiveId) {
int totalRow=messageboardMapper.getTotalCount(receiveId);
if(totalRow%3==0){
    return totalRow/3;

}else {
    return totalRow/3+1;
}

    }



}

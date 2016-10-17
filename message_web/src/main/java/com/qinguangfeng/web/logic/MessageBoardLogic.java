package com.qinguangfeng.web.logic;

import com.qinguangfeng.entity.Messageboard;
import com.qinguangfeng.vo.MessageboardVo;

import java.util.List;

/**
 * Created by Administrator on 2016/9/20.
 */
public interface MessageBoardLogic {

public void sendMessage(Messageboard messageboard);
   // public List<Messageboard> findMyMessage(int receiveId);
    public List<MessageboardVo> findMyMessage(int receiveId);
    public List<MessageboardVo> findMyMessage(int receiveId, int pages);

    public int getTotalCount(int receiveId);


}

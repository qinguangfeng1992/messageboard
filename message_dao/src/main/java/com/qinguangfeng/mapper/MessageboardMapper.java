package com.qinguangfeng.mapper;


import com.qinguangfeng.entity.Messageboard;
import com.qinguangfeng.vo.MessageboardVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MessageboardMapper {

    int insertMsg(Messageboard messageboard);

    int deleteMsg(@Param("boardId") String boardId);

    /*List<Messageboard> searchMsgById(@Param("map") Map<String, String> map);*/
    List<MessageboardVo> searchMsgById(@Param("map") Map<String, String> map, @Param("startrow") Integer startrow);

    int getTotalCount(@Param("receiveuserId") Integer receiveuserId);


}

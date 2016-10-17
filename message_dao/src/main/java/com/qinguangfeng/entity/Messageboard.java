package com.qinguangfeng.entity;

/**
 * 
 * @author qinguangfeng
 */
public class Messageboard {
	/**
	 *  留言的ID,是一个唯一ID
	 */
	private String boardId;
	/**
	 *  发送留言的留言人ID
	 */
	private Integer senduserId;
	/**
	 *  接收者的ID
	 */
	private Integer receiveuserId;
	/**
	 *  留言内容
	 */
	private String messageContext;
	/**
	 *  留言的创建时间
	 */
	private java.util.Date careatTime;
	/**
	 *  标示是否删除0标示删除1标示未删除
	 */
	private Integer isdelete;
	/**
	 * 留言的ID,是一个唯一ID
	 * @param boardId
	 */
	public void setBoardId(String boardId){
		this.boardId = boardId;
	}
	
    /**
     * 留言的ID,是一个唯一ID
     * @return
     */	
    public String getBoardId(){
    	return boardId;
    }
	/**
	 * 发送留言的留言人ID
	 * @param senduserId
	 */
	public void setSenduserId(Integer senduserId){
		this.senduserId = senduserId;
	}
	
    /**
     * 发送留言的留言人ID
     * @return
     */	
    public Integer getSenduserId(){
    	return senduserId;
    }
	/**
	 * 接收者的ID
	 * @param receiveuserId
	 */
	public void setReceiveuserId(Integer receiveuserId){
		this.receiveuserId = receiveuserId;
	}
	
    /**
     * 接收者的ID
     * @return
     */	
    public Integer getReceiveuserId(){
    	return receiveuserId;
    }
	/**
	 * 留言内容
	 * @param messageContext
	 */
	public void setMessageContext(String messageContext){
		this.messageContext = messageContext;
	}
	
    /**
     * 留言内容
     * @return
     */	
    public String getMessageContext(){
    	return messageContext;
    }
	/**
	 * 留言的创建时间
	 * @param careatTime
	 */
	public void setCareatTime(java.util.Date careatTime){
		this.careatTime = careatTime;
	}
	
    /**
     * 留言的创建时间
     * @return
     */	
    public java.util.Date getCareatTime(){
    	return careatTime;
    }
	/**
	 * 标示是否删除0标示删除1标示未删除
	 * @param isdelete
	 */
	public void setIsdelete(Integer isdelete){
		this.isdelete = isdelete;
	}
	
    /**
     * 标示是否删除0标示删除1标示未删除
     * @return
     */	
    public Integer getIsdelete(){
    	return isdelete;
    }
}
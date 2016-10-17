package com.qinguangfeng.vo;

/**
 * 
 * @author qinguangfeng
 */
public class UserinfoVo {
	/**
	 *  
	 */
	private Integer userId;
	/**
	 *  
	 */
	private String userName;
	/**
	 *  
	 */
	private String usePwd;
	/**
	 *  用户头像
	 */
	private String userimage;
	/**
	 * 
	 * @param userId
	 */
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	
    /**
     * 
     * @return
     */	
    public Integer getUserId(){
    	return userId;
    }
	/**
	 * 
	 * @param userName
	 */
	public void setUserName(String userName){
		this.userName = userName;
	}
	
    /**
     * 
     * @return
     */	
    public String getUserName(){
    	return userName;
    }
	/**
	 * 
	 * @param usePwd
	 */
	public void setUsePwd(String usePwd){
		this.usePwd = usePwd;
	}
	
    /**
     * 
     * @return
     */	
    public String getUsePwd(){
    	return usePwd;
    }
	/**
	 * 用户头像
	 * @param userimage
	 */
	public void setUserimage(String userimage){
		this.userimage = userimage;
	}
	
    /**
     * 用户头像
     * @return
     */	
    public String getUserimage(){
    	return userimage;
    }
}
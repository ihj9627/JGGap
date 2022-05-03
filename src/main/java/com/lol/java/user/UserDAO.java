package com.lol.java.user;

public interface UserDAO {

	public int sign_up(UserVO vo);
	
	public UserVO idCheck_Login(UserVO vo);
	
	public String idCheck(String user_id);
	
	public String summoner_idCheck(String summoner_id);
	
	public String tier_info(int user_no);
}

package org.me.web.server.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.me.web.server.entity.SystemUser;

public interface ISystemUserDao{
	public List<SystemUser> getListByMap(Map<String, Object> map);
	public int getListSizeByMap(Map<String, Object> map);//查询列表大小
	public SystemUser getById(String strUserId);
	public int updateUserState(@Param("strUserId")String strUserId, @Param("nState")Integer nState);//更改用户状态
	public SystemUser getByLoginName(String strLoginName);
	public int delById(String strUserId);
}

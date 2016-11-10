package org.me.web.server.dao;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import org.me.web.server.entity.Department;

public interface IDepartmentDao {
	public int insert(Department dept);
	public int delById(String id);
	public int delByLevel(String level);//根据级别删除
	public Department getById(String id);
	public int update(Department dept);
	public List<Department> getListByMap(Map<String, Object> map);
	public int getListSizeByMap(Map<String, Object> map);//查询列表大小
	public String getMaxLevel(@Param("strLevel") String strLevel, @Param("length") int length);//根据当前级别中最大数
}

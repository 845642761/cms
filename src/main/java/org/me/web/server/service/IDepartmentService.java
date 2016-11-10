package org.me.web.server.service;

import java.util.List;

import org.me.web.server.entity.Department;

public interface IDepartmentService {
	/**
	 * 保存
	 * @param dept
	 * @return dept id
	 * @date 2016年5月16日 11:05:07
	 */
	public String insert(Department dept);
	
	public Department getById(String id);

	public int delByIds(List<String> ids);
	
	public int delById(String id);
	
	public int update(Department dept);
	
	public List<Department> getList(Department t);
}

package org.me.web.server.dao;

import java.util.List;
import java.util.Map;

import org.me.web.server.entity.Template;

public interface ITemplateDao {
	public Template getById(String strId);
	public List<Template> getListByMap(Map<String, Object> map);
	public int getListSizeByMap(Map<String, Object> map);
}

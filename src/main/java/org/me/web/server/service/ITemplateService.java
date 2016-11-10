package org.me.web.server.service;

import org.me.plugin.paging.io.QueryPagination;
import org.me.plugin.paging.vo.PageList;
import org.me.web.server.entity.Template;

public interface ITemplateService {
	public Template getById(String strId);
	
	public PageList<Template> getListForPage(Template template, QueryPagination queryPagination);
}

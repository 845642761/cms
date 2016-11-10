package org.me.web.server.service.impl;

import java.util.Map;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.me.core.exception.ParamExecption;
import org.me.core.exception.ServiceExecption;
import org.me.plugin.paging.core.Pagination;
import org.me.plugin.paging.io.QueryPagination;
import org.me.plugin.paging.vo.PageList;
import org.me.plugin.util.ObjectUtil;
import org.me.web.server.dao.ITemplateDao;
import org.me.web.server.entity.Template;
import org.me.web.server.service.ITemplateService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class TemplateService implements ITemplateService {
	private Logger log = Logger.getLogger(TemplateService.class);
	@Resource
	private ITemplateDao templateDao;

	@Override
	public Template getById(String strId) {
		if(!StringUtils.hasText(strId)){
			log.error("templateService getById error : strId is null");
			throw new ParamExecption("templateService getById error : strId is null");
		}
		Template template = null;
		try {
			template = templateDao.getById(strId);
		} catch (Exception e) {
			log.error("templateService-getById error : ", e);
			throw new ServiceExecption("templateService-getById error : ", e);
		}
		return template;
	}

	@Override
	public PageList<Template> getListForPage(Template template,
			QueryPagination queryPagination) {
		Map<String, Object> map = ObjectUtil.objectToMapIgnoreStatic(template);
		PageList<Template> pageList = new PageList<>();
		pageList.setList(templateDao.getListByMap(map));
		Pagination pagination = pageList.getPagination();
		pagination.setNumPerPage(queryPagination.getNumPerPage());
		pagination.setStartIndex(queryPagination.getStartIndex());
		pagination.setTotalRows(templateDao.getListSizeByMap(map));
		return pageList;
	}
}

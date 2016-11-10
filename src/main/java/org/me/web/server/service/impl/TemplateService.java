package org.me.web.server.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.me.core.exception.ParamExecption;
import org.me.core.exception.ServiceExecption;
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
}

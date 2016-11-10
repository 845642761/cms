package org.me.web.system.controller;

import javax.annotation.Resource;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.me.plugin.paging.io.QueryPagination;
import org.me.plugin.paging.vo.PageList;
import org.me.web.core.common.base.BaseController;
import org.me.web.server.entity.Template;
import org.me.web.server.service.ITemplateService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 模版管理
 * @date 2016年11月10日 10:26:05
 */
@Controller
@RequestMapping("/system/template/")
public class STemplateController extends BaseController {
	@Resource
	private ITemplateService templateService;
	
	@RequiresPermissions("template:query")
	@RequestMapping("list")
	public ModelAndView list(Template template,QueryPagination queryPagination) {
		ModelAndView mav = new ModelAndView("/system/template/templateList");
		PageList<Template> templateList = templateService.getListForPage(template, queryPagination);
		mav.addObject("templateList", templateList.getList());
		setPagination(templateList.getPagination());
		return mav;
	}
	
}

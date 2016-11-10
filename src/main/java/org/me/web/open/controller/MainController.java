package org.me.web.open.controller;

import java.io.Writer;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.me.web.core.common.base.CBaseController;
import org.me.web.server.entity.CategoryTemplate;
import org.me.web.server.entity.Template;
import org.me.web.server.service.ICategoryTemplateService;
import org.me.web.server.service.ITemplateService;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main/")
public class MainController extends CBaseController {
	private Logger log = Logger.getLogger(MainController.class);
	@Resource
	private ICategoryTemplateService categoryTemplateService;
	@Resource
	private ITemplateService templateService;
	
	@RequestMapping("index")
	public void index(Writer writer) {
		HttpServletResponse response =  getResponse();
		response.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html;charset=UTF-8");
	    
	    CategoryTemplate categoryTemplate = categoryTemplateService.getById("1");
	    StringBuffer sb = new StringBuffer();
	    if(categoryTemplate != null){
		    if(StringUtils.hasText(categoryTemplate.getStrDTDId())){
		    	Template dtd = templateService.getById(categoryTemplate.getStrDTDId());
		    	if(dtd != null)
		    		sb.append(dtd.gettContent());
		    	else
		    		sb.append("<!DOCTYPE html>");
		    }else {
				sb.append("<!DOCTYPE html>");
			}
		    sb.append("<html><head>");
		    if(StringUtils.hasText(categoryTemplate.getStrMetaId())){
		    	Template meta = templateService.getById(categoryTemplate.getStrMetaId());
		    	if(meta != null){
		    		sb.append(meta.gettContent());
		    	}
		    }
		    if(StringUtils.hasText(categoryTemplate.getStrCssId())){
		    	Template css = templateService.getById(categoryTemplate.getStrCssId());
		    	if(css != null){
		    		sb.append(css.gettContent());
		    	}
		    }
		    sb.append("</head><body>");
		    if(StringUtils.hasText(categoryTemplate.getStrHeadId())){
		    	Template head = templateService.getById(categoryTemplate.getStrHeadId());
		    	if(head != null){
		    		sb.append(head.gettContent());
		    	}
		    }
		    if(StringUtils.hasText(categoryTemplate.getStrNavId())){
		    	Template nav = templateService.getById(categoryTemplate.getStrNavId());
		    	if(nav != null){
		    		sb.append(nav.gettContent());
		    	}
		    }
		    if(StringUtils.hasText(categoryTemplate.getStrContentId())){
		    	Template content = templateService.getById(categoryTemplate.getStrContentId());
		    	if(content != null){
		    		sb.append(content.gettContent());
		    	}
		    }
		    if(StringUtils.hasText(categoryTemplate.getStrFooterId())){
		    	Template footer = templateService.getById(categoryTemplate.getStrFooterId());
		    	if(footer != null)
		    		sb.append(footer.gettContent());
		    }
		    sb.append("</body>");
		    if(StringUtils.hasText(categoryTemplate.getStrJavascriptId())){
		    	Template javascript = templateService.getById(categoryTemplate.getStrJavascriptId());
		    	if(javascript != null)
		    		sb.append(javascript.gettContent());
		    }
		    sb.append("</html>");
	    }
	    
		try {
			writer.write(sb.toString());
			writer.flush();
			writer.close();
		} catch (Exception e) {
			log.error("mainController - index error : ", e);
		}
	}
}

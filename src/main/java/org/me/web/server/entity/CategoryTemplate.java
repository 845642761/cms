package org.me.web.server.entity;

import java.util.Date;

import org.me.core.common.base.BaseEntity;

/**
 * 栏目模版对应关系
 * @date 2016年11月8日 14:06:08
 */
public class CategoryTemplate extends BaseEntity {
	private static final long serialVersionUID = 1L;
	private String strCategoryId;//主键Id(栏目Id)
	private String strDTDId;//DTD模版Id
	private String strMetaId;//Meta模版Id
	private String strCssId;//css模版Id
	private String strHeadId;//头部模版Id
	private String strNavId;//导航模版Id
	private String strContentId;//内容模版Id
	private String strFooterId;//尾部模版Id
	private String strJavascriptId;//Javascript模版Id
	private Integer nState;//状态:0-正常,-1-禁用
	private Date dtUpdateTime;//修改时间:yyyy-mm-dd HH:mm:ss
	
	public String getStrCategoryId() {
		return strCategoryId;
	}
	public void setStrCategoryId(String strCategoryId) {
		this.strCategoryId = strCategoryId;
	}
	public String getStrContentId() {
		return strContentId;
	}
	public void setStrContentId(String strContentId) {
		this.strContentId = strContentId;
	}
	public String getStrMetaId() {
		return strMetaId;
	}
	public void setStrMetaId(String strMetaId) {
		this.strMetaId = strMetaId;
	}
	public String getStrHeadId() {
		return strHeadId;
	}
	public void setStrHeadId(String strHeadId) {
		this.strHeadId = strHeadId;
	}
	public String getStrNavId() {
		return strNavId;
	}
	public void setStrNavId(String strNavId) {
		this.strNavId = strNavId;
	}
	public String getStrFooterId() {
		return strFooterId;
	}
	public void setStrFooterId(String strFooterId) {
		this.strFooterId = strFooterId;
	}
	public String getStrCssId() {
		return strCssId;
	}
	public void setStrCssId(String strCssId) {
		this.strCssId = strCssId;
	}
	public Integer getnState() {
		return nState;
	}
	public void setnState(Integer nState) {
		this.nState = nState;
	}
	public Date getDtUpdateTime() {
		return dtUpdateTime;
	}
	public void setDtUpdateTime(Date dtUpdateTime) {
		this.dtUpdateTime = dtUpdateTime;
	}
	public String getStrDTDId() {
		return strDTDId;
	}
	public void setStrDTDId(String strDTDId) {
		this.strDTDId = strDTDId;
	}
	public String getStrJavascriptId() {
		return strJavascriptId;
	}
	public void setStrJavascriptId(String strJavascriptId) {
		this.strJavascriptId = strJavascriptId;
	}
}

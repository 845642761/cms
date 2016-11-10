package org.me.web.server.entity;

import java.util.Date;

import org.me.core.common.base.BaseEntity;

public class Template extends BaseEntity {
	private static final long serialVersionUID = 1L;
	private String strId;//主键Id
	private String strName;//名称
	private Integer nType;//类型  0-其它;1-DTD模版;2-meta信息模版;3-Css模版;4-头部模版;5-导航模版;6-内容模版;7-尾部模版;8-javascript模版;
	private String strDescription;//描述
	private String tContent;//内容
	private Integer nState;//状态:0-正常,-1-禁用
	private Date dtUpdateTime;//更新时间:yyyy-mm-dd HH:mm:ss
	
	public String getStrId() {
		return strId;
	}
	public void setStrId(String strId) {
		this.strId = strId;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public Integer getnType() {
		return nType;
	}
	public void setnType(Integer nType) {
		this.nType = nType;
	}
	public String getStrDescription() {
		return strDescription;
	}
	public void setStrDescription(String strDescription) {
		this.strDescription = strDescription;
	}
	public String gettContent() {
		return tContent;
	}
	public void settContent(String tContent) {
		this.tContent = tContent;
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
}

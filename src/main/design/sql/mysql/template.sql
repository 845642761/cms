USE cms;

-- 创建模版表
DROP TABLE IF EXISTS `template`;
CREATE TABLE `template`(
	strId							VARCHAR(32)		NOT NULL				COMMENT "主键Id",	
	strName							VARCHAR(50)		NOT NULL				COMMENT "名称",
	nType							TINYINT			NOT NULL				COMMENT "类型 0-其它;1-DTD模版;2-meta信息模版;3-Css模版;4-头部模版;5-导航模版;6-内容模版;7-尾部模版;8-javascript模版;",
	strDescription					VARCHAR(200)	DEFAULT	NULL			COMMENT "描述",
	tContent						TEXT			DEFAULT	NULL			COMMENT "内容",
	nState							TINYINT			NOT NULL DEFAULT 0		COMMENT "状态:0-正常,-1-禁用",
	dtUpdateTime					DATETIME		NOT NULL DEFAULT now()	COMMENT "更新时间:yyyy-mm-dd HH:mm:ss",
	PRIMARY KEY(strId),
	UNIQUE(strId)
)
ENGINE=INNODB
DEFAULT CHARACTER SET=utf8;
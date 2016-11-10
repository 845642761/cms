USE cms;

-- 创建栏目模版对应表
DROP TABLE IF EXISTS `categoryTemplate`;
CREATE TABLE `categoryTemplate`(
	strCategoryId					VARCHAR(32)		NOT NULL				COMMENT "主键Id(栏目Id)",
	strDTDId						VARCHAR(32)		DEFAULT	NULL			COMMENT "DTD Id",
	strMetaId						VARCHAR(32)		DEFAULT	NULL			COMMENT "Meta模版Id",
	strCssId						VARCHAR(32)		DEFAULT	NULL			COMMENT "css模版Id",
	strHeadId						VARCHAR(32)		DEFAULT	NULL			COMMENT "头部模版Id",
	strNavId						VARCHAR(32)		DEFAULT	NULL			COMMENT "导航模版Id",
	strContentId					VARCHAR(32)		DEFAULT	NULL			COMMENT "内容模版Id",
	strFooterId						VARCHAR(32)		DEFAULT	NULL			COMMENT "尾部模版Id",
	strJavascriptId					VARCHAR(32)		DEFAULT	NULL			COMMENT "Javascript模版Id",
	nState							TINYINT			NOT NULL DEFAULT 0		COMMENT "状态:0-正常,-1-禁用",
	dtUpdateTime					DATETIME		NOT NULL DEFAULT now()	COMMENT "更新时间:yyyy-mm-dd HH:mm:ss",
	PRIMARY KEY(strCategoryId),
	UNIQUE(strCategoryId)
)
ENGINE=INNODB
DEFAULT CHARACTER SET=utf8;
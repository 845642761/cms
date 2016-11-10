USE cms;

-- 初始化菜单数据
INSERT INTO `permission` (`strId`, `strPid`, `strName`, `strPermission`, `strDescription`, `nType`, `nState`, `dtCreateTime`) 
VALUES 
('001', '0', '系统管理', "sys:query", '系统管理', '0', '0', now()),

('001-001', '001', '部门管理', '/system/department/list', '部门管理', '0', '0', now()),
('001-001-001', '001-001', '部门详情查看', 'dept:detail', '部门详情查看', '1', '0', now()),
('001-001-002', '001-001', '部门添加修改', 'dept:saveOrUpdate', '部门添加修改', '1', '0', now()),
('001-001-003', '001-001', '部门删除', 'dept:del', '部门删除', '1', '0', now()),
('001-001-004', '001-001', '部门添加', 'dept:add', '部门添加', '1', '0', now()),
('001-001-005', '001-001', '部门查询', 'dept:query', '部门查询', '1', '0', now()),

('001-002', '001', '用户管理', '/system/user/list', '用户管理', '0', '0', now()),
('001-002-001', '001-002', '部门用户列表', 'sysuser:query', '部门用户列表', '1', '0', now()),
('001-002-002', '001-002', '用户详情查看', 'sysuser:detail', '用户详情查看', '1', '0', now()),
('001-002-003', '001-002', '用户添加修改', 'sysuser:saveOrUpdate', '用户添加修改', '1', '0', now()),
('001-002-004', '001-002', '用户查询', 'sysuser:add', '用户查询', '1', '0', now()),

('002', '0', '信息管理', 'article:query', '信息管理', '0', '0', now()),
('002-001', '002', '文章管理', '/system/article/list', '文章管理', '0', '0', now()),

('002-002', '002', '栏目管理', '/system/category/list', '栏目管理', '0', '0', now()),
('002-002-001', '002-002', '栏目详情查看', 'category:detail', '栏目详情查看', '1', '0', now()),
('002-002-002', '002-002', '栏目添加', 'category:add', '栏目添加', '1', '0', now()),
('002-002-003', '002-002', '栏目添加修改', 'category:saveOrUpdate', '栏目添加修改', '1', '0', now()),
('002-002-004', '002-002', '栏目删除', 'category:del', '栏目删除', '1', '0', now()),
('002-002-005', '002-002', '栏目查询', 'category:query', '栏目查询', '1', '0', now());

-- 初始化部门数据
INSERT INTO `department` (`strId`,`strPid`,`strName`,`strDescription`,`nState`,`dtCreateTime`,`nChild`,`strLevel`)
VALUES('1' ,'0','组织机构' ,'组织机构' ,'0',now() ,'0' ,'001');

-- 初始化栏目数据
INSERT INTO `category` (`strId`,`strPid`,`strName`,`strDescription`,`nState`,`dtCreateTime`,`nChild`,`strLevel`)
VALUES('1' ,'0','栏目库' ,'栏目库' ,'0',now() ,'0' ,'001');
USE cms;

-- 初始化用户数据
INSERT INTO `systemuser` (`strUserId`,`strLoginName`, `strPassword`, `strName`, `nSex`, `strMobile`, `strPhone`, `strEmail`, `strQQ`, `strWeChar`, `dtBirthday`, `strAddress`, `strHeadURL`, `nState`, `strDeptId`, `dtCreateTime`, `dtUpdateTime`) 
VALUES ('1', 'admin', '00000000', 'admin', '0', NULL , NULL, NULL , NULL, NULL , now() , NULL , NULL, '1', '1', now() , now());

-- 初始化角色数据
INSERT INTO `role` (`strId`, `strName`, `strDescription`, `nState`) 
VALUES ('1', 'admin', '管理员', '0');

-- 初始化角色权限数据
INSERT INTO `rolepermission` (`strId`, `strRoleId`, `strPermissionId`) 
VALUES ('001', '1', '001'),
('001-001', '1', '001-001'),
('001-001-001', '1', '001-001-001'),
('001-001-002', '1', '001-001-002'),
('001-001-003', '1', '001-001-003'),
('001-001-004', '1', '001-001-004'),
('001-001-005', '1', '001-001-005'),

('001-002', '1', '001-002'),
('001-002-001', '1', '001-002-001'),
('001-002-002', '1', '001-002-002'),
('001-002-003', '1', '001-002-003'),
('001-002-004', '1', '001-002-004'),

('002', '1', '002'),
('002-001', '1', '002-001'),

('002-002', '1', '002-002'),
('002-002-001', '1', '002-002-001'),
('002-002-002', '1', '002-002-002'),
('002-002-003', '1', '002-002-003'),
('002-002-004', '1', '002-002-004'),
('002-002-005', '1', '002-002-005');

-- 初始化用户角色数据
INSERT INTO `userrole` (`strId`, `strLoginId`, `strRoleId`) 
VALUES ('1', '1', '1');
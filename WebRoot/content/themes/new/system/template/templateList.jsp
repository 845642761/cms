<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>${cmsInfo.title}</title>
<meta charset="utf-8" />
<%@ include file="../../init/cssInit.jsp" %>
<link href="<%=basePath%>/plugins/pagination/pagination.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<table class="table">
		<thead>
			<th></th>
			<th>名称</th>
			<th>描述</th>
			<th>类型</th>
			<th>状态</th>
			<th>更新时间</th>
		</thead>
		<c:forEach items="${templateList}" var="template">
			<tr>
				<td><input name="strId" value="${template.strId}" type="checkbox" /></td>
				<td class = "toDetail" value = "${template.strId}">${template.strName}</td>
				<td>${template.strDescription}</td>
				<td>
					<c:choose>
						<c:when test="${template.nType == 0 }">其它</c:when>
						<c:when test="${template.nType == 1 }">DTD模版</c:when>
						<c:when test="${template.nType == 2 }">meta信息模版</c:when>
						<c:when test="${template.nType == 3 }">css模版</c:when>
						<c:when test="${template.nType == 4 }">头部模版</c:when>
						<c:when test="${template.nType == 5 }">导航模版</c:when>
						<c:when test="${template.nType == 6 }">内容模版</c:when>
						<c:when test="${template.nType == 7 }">尾部模版</c:when>
						<c:when test="${template.nType == 8 }">javascript模版</c:when>
						<c:otherwise>异常</c:otherwise>
					</c:choose>
				</td>
				<td>
					<c:choose>
						<c:when test="${template.nState == 0 }">正常</c:when>
						<c:when test="${template.nState == -1 }">禁用</c:when>
						<c:otherwise>异常</c:otherwise>
					</c:choose>
				</td>
				<td>
					<fmt:formatDate value="${template.dtUpdateTime}" pattern="yyyy-MM-dd HH:mm:ss" type="date" />
				</td>
			</tr>
		</c:forEach>
	</table>
	<pg:defaultPaging url="${url}" totalRows="${totalRows}" numPerPage="${numPerPage}" startIndex="${startIndex}"/>
</body>
</html>
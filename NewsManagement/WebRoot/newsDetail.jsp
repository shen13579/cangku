<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'newsDetail.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <form action="newsDetail/newsList" method="post">
   <table cellpadding="0" cellspacing="0" border="1">
   	<caption>新闻标题</caption>
   <thead>
   	<tr bgcolor="#CCCCFE">
   	<th>新闻编号</th>
   	<th>新闻名称</th>
   	<th>新闻摘要</th>
   	<th>作者</th>
   	<th>创建时间</th>
   	<th>操作</th>
   	</tr>
   </thead>
  <tbody>
  	<c:forEach items="${detaillist}" var="d" varStatus="s">
  	<c:if test="${s.index%2==0}">
  		<tr bgcolor="#89D0FE">
  		</c:if>
  			<td>${d.id}</td>
  			<td>${d.title}</td>
  			<td>${d.summary}</td>
  			<td>${d.author}</td>
  			<td>
  				<f:formatDate value="${d.createdate}" pattern="yyyy-MM-dd hh:mm"/>
  			</td> 
  			<td>
  				<a href="newsDetail/findComments?id=${d.id}">查看评论</a>
  				<a href="#">评论</a>
  				<a href="#">删除</a>
  			</td>		
  		</tr>  	 	
  	</c:forEach>
  </tbody>    
   </table>   
   
   </form>
  </body>
</html>

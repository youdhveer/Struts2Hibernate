<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<body>
<h2>Welcome struts 2 Hibernate(Pure XML based mapping) demo application</h2>


<br/>
<br/>
<s:form action="addStudent">
  <s:textfield name="name"  value="test"/>
  </s:form>
<a href="<%=request.getContextPath() %>/stocks.action">Click here to see stock app using MySQL DB</a>
<br/>
<a href="<%=request.getContextPath() %>/login.action">Click here to see login validation app</a>

<br/>
<a href="<%=request.getContextPath() %>/home.action">Click here to go test app</a>
</body>
</html>

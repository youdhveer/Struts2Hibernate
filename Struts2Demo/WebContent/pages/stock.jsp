<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>   
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Stock List</title>
</head>
<body>

	<div align="center">
		<s:form action="addStock">
		  <table width="80%" border="1" style="border-collapse: collapse;">
                <tr>
                    <td>Stock Code </td>
                    <td><input type="text" name="stockCode" id="stockCode" value="" /></td>                    
                </tr>
                <tr>
                    <td>Stock Name </td>
                    <td><input type="text" name="stockName" id="stockName" value="" /></td>                    
                </tr>
                <tr>
                    <td>Stock Company </td>
                    <td><input type="text" name="company" id="company" value="" /></td>                    
                </tr>
                <tr>
                    <td>Stock Description </td>
                    <td><input type="text" name="description" id="description" value="" /></td>                    
                </tr>
                <tr>
                   <td></td>
                   <td><input type="submit" value="Add Stock" /></td>
                </tr>
              
           </table>
		</s:form>
	</div>
	<br/>
	<h3>List of stock</h3>
    <div align="center">
        <table width="80%" border="1" style="border-collapse: collapse;">
            <tr>
                <th>No</th>
                <th>Stock Code</th>
                <th>Stock Name</th>
                <th>Company</th>
            </tr>
            <s:iterator value="stockList" status="stat">
                <tr>
                    <td><s:property value="#stat.count" /></td>
                    <td><s:property value="stockCode" /></td>
                    <td><s:property value="stockName" /></td>
                    <td><s:property value="companyName" /></td>
                </tr>
            </s:iterator>        
        </table>
    </div>
</body>
</html>
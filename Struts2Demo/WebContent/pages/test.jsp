<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>

<style type="text/css">
.errors {
	background-color:#FFCCCC;
	border:1px solid #CC0000;
	width:400px;
	margin-bottom:8px;
}
.errors li{ 
	list-style: none; 
}
</style>

</head>

<body>
<h1>Test Action : Boolean properties</h1>

<s:if test="hasActionErrors()">
   <div class="errors">
      <s:actionerror/>
   </div>
</s:if>

<s:form action="testBoolean" onsubmit="testData()">
	<s:if test="%{adminUser}">
	   Admin User :: <s:property value="adminUser"/>
	</s:if>
	<s:textfield name="userName" value="User"/>
	<s:hidden name="adminUser" id="adminUser" value=""/>
	<s:submit name="submit" value="Submit Data"/>
</s:form>

<h3>Test radio tags.............</h3>

<s:form action="testTag" >
    <s:iterator value="stockDTOList">
	  <s:property value="stockCode"/>
	</s:iterator>
	<s:radio label="Answer" name="yourAnswer" list="#{'1':'Yes','2':'No'}" value="2" id="selectedOption" />
		
	<s:if test="%{dataMap !=null}">
		<s:radio label="Data" name="yourData" list="dataMap" value="defaultGenderValue" />
	</s:if>
	
	<s:if test="stockDTOList !=null">
		 <s:radio label="Stock" name="yourLanguage" list="stockDTOList"
      listKey="stockId" listValue="stockCode" value="defaultLanguageValue" />
	</s:if>
	
	<s:submit name="submit" value="Submit Data"/>
</s:form>


<script>
  function testData(){
	  document.getElementById('adminUser').value=true;
	  console.log("=================================");
  }
</script>
</body>
</html>
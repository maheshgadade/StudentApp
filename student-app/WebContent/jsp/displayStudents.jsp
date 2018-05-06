
<%@page import="com.student.model.Student"%>
<%@page language="java" import="java.util.*"%>
<html>
<head>
<title>Data Page</title>
<%-- 
<script language="javascript" type="text/javascript">
 
function doSubmit()
{
document.getElementById("demo").innerHTML = "My First JavaScript";
window.transfer("edit.jsp");
}
</script> 
--%> 
</head>
<body>
<p id="demo"></p>
	<table border="1" width="style=%""width:80">
		<tr>
			<th width="119"><b>ID</b></th>
			<th width="168"><b>First Name</b></th>
			<th width="168"><b>Last Name</b></th>
			<th width="168"><b>City Name</b></th>
			<th width="1"><b>Email</b></th>
			<th width="168"><b>Action</b></th>
			
		</tr>
		<%
			Iterator itr;
			List data = (List) request.getAttribute("studentList");
			for (itr = data.iterator(); itr.hasNext();) {
				Student student = (Student) itr.next();
		%>
		<tr>
			<td width="119"><%=student.getId()%></td>
			<td width="168"><%=student.getFirstName()%></td>
			<td width="168"><%=student.getLastName()%></td>
			<td width="119"><%=student.getCityName()%></td>
			<td width="168"><%=student.getEmail()%></td>
			<td><input type = "button" value ="Edit"> <input type = "button" value="Delete">
			
		</tr>
		<%}%>
	</table>
	
</body>
</html>
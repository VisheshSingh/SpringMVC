<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title>Customer Registration</title>
	<style>
		.error{
			color:#f00;
		}
	</style>
</head>
<body>

<i>Fill out the form. (*) means required.</i>
	<form:form action="processForm" modelAttribute="customer">
	
		First Name: <form:input path="firstName" />
		<br><br>
		
		Last Name (*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br><br>
		
		<input type="submit" value="Submit" />
	</form:form >
</body>
</html>
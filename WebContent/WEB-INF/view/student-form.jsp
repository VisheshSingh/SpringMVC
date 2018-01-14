<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>
	<form:form action="processForm" modelAttribute="student">
	
	First Name: <form:input path="firstName"/>
	<br/><br/>
	
	Last Name: <form:input path="lastName"/>
	<br/><br/>
	
	Country: <form:select path="country">
		<form:options items="${student.countryOptions }" />
	</form:select>
	<br/><br/>
	Favorite Language:
	<%-- Java <form:radiobutton path="favoriteLanguage" value="Java" />
	PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
	Python <form:radiobutton path="favoriteLanguage" value="Python" />
	C# <form:radiobutton path="favoriteLanguage" value="C#" /> --%>
	
	<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"  />
	<br/><br/>
	
	Operating Systems: 
	Linux <form:checkbox path="operatingSystems" value="Linux" />
	MS Windows <form:checkbox path="operatingSystems" value="MS Windows" />
	Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
	<br/><br/>
	
	<input type="submit" value="Submit" />
	</form:form>
</body>
</html>
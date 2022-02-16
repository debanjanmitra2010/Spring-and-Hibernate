<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>
<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />

		<br>
		<br>
	
		Last name: <form:input path="lastName" />

		<br>
		<br>
		
		Country by Method 1: 
		
		<form:select path="country">

			<form:option value="Brazil" label="Brazil" />
			<form:option value="France" label="France" />
			<form:option value="Germany" label="Germany" />
			<form:option value="India" label="India" />
			<form:option value="United States" label="United States" />

		</form:select>

		<br>
		<br>
		
		Favorite Language:
		
		Java <form:radiobutton path="favouriteLang" value="Java" />  
		C# <form:radiobutton path="favouriteLang" value="C#" /> 
		PHP <form:radiobutton path="favouriteLang" value="PHP" /> 
		Python <form:radiobutton path="favouriteLang" value="Python" />

		<br>
		<br>

		Country by Method 2: 
		
		<form:select path="country">

			<form:options items="${student.countryOptions}" />

		</form:select>

		<br>
		<br>
		
		Operating System :
		
		Linux <form:checkbox path="os" value="Linux" /> 
		Mac OS <form:checkbox path="os" value="Mac OS" /> 
		MS Windows <form:checkbox path="os" value="MS Windows" />

		<br>
		<br>


		<input type="submit" value="Submit" />

	</form:form>
</body>

</html>

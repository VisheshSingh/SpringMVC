<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %> 

<html>
<head>
	<title>Success Confirmation</title>
</head>

<body>
	The Customer is confirmed: ${customer.firstName } ${customer.lastName }
	<br><br>
	Free passes: ${customer.freePasses }
</body>
</html>
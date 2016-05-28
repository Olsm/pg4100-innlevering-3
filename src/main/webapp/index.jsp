<%@ page import="com.smaola14.PrimeNumberCalculator" %>

<link href=<%= request.getContextPath() + "/css/style.css" %> rel="stylesheet" type="text/css">
<%--https://fonts.googleapis.com/css?family=Raleway--%>
<link href=<%= request.getContextPath() + "/css/raleway.css" %> rel='stylesheet' type='text/css'>

<%  PrimeNumberCalculator calc = new PrimeNumberCalculator();
    String number = request.getParameter("number");
    if (request.getMethod().equals("GET")) number = null; %>

<!DOCTYPE html>

<head>
    <meta charset="UTF-8">
    <title>Prime Number Calculator</title>
</head>

<body>
    <h1>Prime Number Calculator</h1>

    <form action="/PrimeNumberCalculator/" method="POST">
        <input type="number" id="input" name="number" placeholder="number..."
               min="<%=Integer.MIN_VALUE%>" max="<%=Integer.MAX_VALUE%>" required>
        <input type="submit" class="btnCheck" value="Check"/>
    </form>

    <% String result = calc.isPrimeToString(number);
        String color = "red";
        if (result.contains("is prime"))
            color = "green"; %>

    <div id="result" class=<%=color%>><%=result%></div>

</body>

</html>

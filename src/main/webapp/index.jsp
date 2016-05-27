<%@ page import="com.smaola14.PrimeNumberCalculator" %>

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
        Number: <input type="number" name="number" required
                       min="<%=Integer.MIN_VALUE%>" max="<%=Integer.MAX_VALUE%>">
        <input type="submit" value="Check"/>
    </form>

    <br><%= calc.isPrimeToString(number) %>
</body>

</html>

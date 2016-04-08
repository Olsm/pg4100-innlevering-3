<%@ page import="com.smaola14.PrimeNumberCalculator" %>
<%
    PrimeNumberCalculator calc = new PrimeNumberCalculator();
    String number = request.getParameter("number");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Prime Number Calculator</title>
</head>
<body>
    <h1>Prime Number Calculator</h1>

    <form action="index.jsp" method="POST">
        Number: <input type="number" name="number">
        <input type="submit" value="Check"/>
    </form>

    <% if (number != null && !number.isEmpty())  {
        out.println(number + " is prime: " + calc.isPrimeNumber(number));
    }
    %>
</body>
</html>

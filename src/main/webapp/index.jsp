<%@ page import="com.smaola14.PrimeNumberCalculator" %>

<%  PrimeNumberCalculator calc = new PrimeNumberCalculator();
    String number = request.getParameter("number"); %>

<!DOCTYPE html>

<head>
    <meta charset="UTF-8">
    <title>Prime Number Calculator</title>
</head>

<body>
    <h1>Prime Number Calculator</h1>

    <form method="POST">
        Number: <input type="number" name="number" required>
        <input type="submit" value="Check"/>
    </form>

    <br><%= calc.isPrimeToString(number) %>
</body>

</html>

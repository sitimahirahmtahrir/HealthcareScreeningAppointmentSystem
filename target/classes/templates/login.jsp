<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <header>
        <h1>Login</h1>
    </header>
    <main>
        <section id="login-form">
            <form action="loginController" method="post">
                <label for="username">Username:</label>
                <input type="text" name="username" id="username" required><br>
                <label for="password">Password:</label>
                <input type="password" name="password" id="password" required><br>
                <button type="submit">Log In</button>
            </form>
            <p>Don't have an account? <a href="register.jsp">Register here</a></p>
        </section>
    </main>
    <footer>
        <p>&copy; 2023 Healthcare Screening Appointment System. All rights reserved.</p>
    </footer>
</body>
</html>
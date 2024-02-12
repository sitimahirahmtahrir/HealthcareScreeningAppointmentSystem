<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <header>
        <h1>Register</h1>
    </header>
    <main>
        <section id="register-form">
            <form action="registerController" method="post">
                <label for="username">Username:</label>
                <input type="text" name="username" id="username" required><br>
                <label for="email">Email:</label>
                <input type="email" name="email" id="email" required><br>
                <label for="password">Password:</label>
                <input type="password" name="password" id="password" required><br>
                <label for="confirm-password">Confirm Password:</label>
                <input type="password" name="confirm-password" id="confirm-password" required><br>
                <button type="submit">Register</button>
            </form>
            <p>Already have an account? <a href="login.jsp">Log in here</a></p>
        </section>
    </main>
    <footer>
        <p>&copy; 2023 Healthcare Screening Appointment System. All rights reserved.</p>
    </footer>
</body>
</html>
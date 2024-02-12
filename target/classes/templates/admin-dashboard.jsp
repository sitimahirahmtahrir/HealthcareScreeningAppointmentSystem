<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <header>
        <h1>Admin Dashboard</h1>
    </header>
    <main>
        <section id="admin-dashboard">
            <h2>Welcome, ${sessionScope.currentUser.username}!</h2>
            <nav>
                <ul>
                    <li><a href="manage-users.jsp">Manage Users</a></li>
                    <li><a href="manage-packages.jsp">Manage Packages</a></li>
                </ul>
            </nav>
        </section>
    </main>
    <footer>
        <p>&copy; 2023 Healthcare Screening Appointment System. All rights reserved.</p>
    </footer>
</body>
</html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Book Appointment</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <header>
        <h1>Book Appointment</h1>
    </header>
    <main>
        <section id="book-appointment-form">
            <h2>Select a Package</h2>
            <form action="bookAppointmentController" method="post">
                <label for="packageId">Package ID:</label>
                <select id="packageId" name="packageId">
                    <!-- Package options will be populated here by the controller -->
                </select><br>
                <label for="appointmentDate">Appointment Date:</label>
                <input type="date" id="appointmentDate" name="appointmentDate" required><br>
                <button type="submit">Book Appointment</button>
            </form>
        </section>
    </main>
    <footer>
        <p>&copy; 2023 Healthcare Screening Appointment System. All rights reserved.</p>
    </footer>
</body>
</html>
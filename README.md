#COMP 2009 SOFTWARE ENGINEERING AND HCI - VOLUNTEER.ME APP

###MEMBERS:

1. Muhammad Rafdi
2. Archit Sajdeva
3. Georgi Georgiev
4. Shubham Bakshi
5. Ulas Zeyrek
6. Andreas Milhaionis
7. Garsing Chow


## **IMPORTANT** SETUP - PLEASE READ THIS SECTION

### Deploying the application
1. Install eclipse for Java EE
2. Install Spring and maven as a plugin to eclipse
3. Right click on the project and run as maven build ... (Not run maven build without the options).
4. Type jetty:run on the goals section.
5. Browse the app from localhost:8080.

On deployment, admin account is created. The name and password is admin.

### Sitemap

1. /   - This is the homepage.
2. /login.html    - user/admin login page. User login requires name and password.
3. /register.html    - user registration page.
4. /register    - organisation.html  - organisation registration page.
5. /vws.html    - List of volunteering opportunities.
6. /vws/${id}.html (e.g /vws/1.html)    - Volunteering opportunities details.
7. /profile.html    -  User/admin profile (*NOTE* Will throw an error if not logged in).
8. /users.html     - List down all users (Admin privilege).
9. /users/${id}.html (e.g /users/1.html)    - Show the profile of user with specific id (Admin privilege).
10. /organisations.html    - List down all available organisations.
11. /register-organisation.html    - Register as an organisation.
12. /organisations/${id}.html (e.g /organisations/1.html) - Show organisation profile with specific organisation id.

### Testing

JUnit test case class VWServiceTest must be executed separately. To run the test class, Uncomment it and run as a JUnit test case. All test cases should pass.










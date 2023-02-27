# Password-Manager
The Password Manager is a junior level application developed in Java in which you can (1) automatically generate a password
or (2) come up with a password yourself and check how strong it is.

To start, go to the AppRunner class.

* Use the getGeneratedPassword() method if you want to automatically generate a new 16-character password.
* Use the getHandMadePassword() method to manually enter your password in its entirety and check its strength.
* Use the getHandMadePassword_II() method to create the password character by character.

### Password Generator - getGeneratedPassword()

The Password Generator creates passwords by randomly selecting characters. 
The characters are held in a developer-defined library, which can be freely modified.
The created password is statistically analyzed together with its strength.
Password strength is also configurable by the developer.

### Password Strength Verifier I - getHandMadePassword()

The Password Strength Verifier (I) gives the ability to enter the entire password of any length of characters and check its strength.

### Password Strength Verifier II - getHandMadePassword_II()

The Password Strength Verifier (II) allows you to create a password character by character with the current analysis of password strength, 
which takes place after entering the first character.

### General principles of password strength gradation

* Very weak password:          The password is lesser or equals 7 characters.
* Weak password:               The password contains 8 characters or more but the number of digits or capital letters or special characters is 0.
* Medium strength password:    The password contains 8 characters or more including 1 digit or 1 capital letter or 1 special character.
* Strong password:             The password contains 8 characters or more including 2 digits or 2 capital letters or 2 special characters.
* Very strong password:        The password contains 8 characters or more including more than 2 digits or more than 2 capital letters
                                      or more than 2 special characters.

Technologies used in the project are: IDE - IntelliJ Idea Community; Maven; Java - 15; TDD, Design Patterns, Clean Code.

Contact data:

Author: Przemyslaw Karcz - Junior Java Developer
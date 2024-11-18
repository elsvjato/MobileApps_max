package com.example.mobileapps

class CredentialsManager {

    // Function to validate email
    fun isEmailValid(email: String): Boolean {
        if (email.isEmpty()) return false

        // Basic email pattern check (contains '@' and '.')
        val emailPattern = Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")
        return emailPattern.matches(email)
    }

    // Function to validate password
    fun isPasswordValid(password: String): Boolean {
        return password.isNotEmpty()
    }
}

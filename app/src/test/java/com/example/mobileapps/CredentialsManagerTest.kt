package com.example.mobileapps

import org.junit.Test
import org.junit.Assert.*

class CredentialsManagerTest {

    private val credentialsManager = CredentialsManager()

    // Test empty email
    @Test
    fun givenEmptyEmail_thenReturnFalse() {
        val isEmailValid = credentialsManager.isEmailValid("")
        assertEquals(false, isEmailValid)
    }

    // Test wrong email format
    @Test
    fun givenInvalidEmailFormat_thenReturnFalse() {
        val isEmailValid = credentialsManager.isEmailValid("invalid-email")
        assertEquals(false, isEmailValid)
    }

    // Test well-formatted email
    @Test
    fun givenValidEmailFormat_thenReturnTrue() {
        val isEmailValid = credentialsManager.isEmailValid("example@test.com")
        assertEquals(true, isEmailValid)
    }

    // Test empty password
    @Test
    fun givenEmptyPassword_thenReturnFalse() {
        val isPasswordValid = credentialsManager.isPasswordValid("")
        assertEquals(false, isPasswordValid)
    }

    // Test filled password
    @Test
    fun givenNonEmptyPassword_thenReturnTrue() {
        val isPasswordValid = credentialsManager.isPasswordValid("mySecurePassword")
        assertEquals(true, isPasswordValid)
    }
}

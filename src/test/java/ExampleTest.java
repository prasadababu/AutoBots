package test.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    @Test
    void testIsPositiveNumber() {
        int number = 5;
        
        // Using assertTrue to check if the number is positive
        assertTrue(number > 0, "The number should be positive");
    }

    @Test
    void testStringContainsSubstring() {
        String text = "JUnit 5 assertions are powerful!";
        
        // Using assertTrue to check if a string contains a substring
        assertTrue(text.contains("assertions"), "The text should contain the word 'assertions'");
        // fail("");
    }
}

package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UtilsTest {
    @Test
    public void testIsPositiveNumber() {
        assertTrue(StringUtils.isPositiveNumber("12"));
        assertTrue(StringUtils.isPositiveNumber("79"));
        assertFalse(StringUtils.isPositiveNumber("-12"));
        assertFalse(StringUtils.isPositiveNumber("0"));
        assertFalse(StringUtils.isPositiveNumber("abc"));
    }
}

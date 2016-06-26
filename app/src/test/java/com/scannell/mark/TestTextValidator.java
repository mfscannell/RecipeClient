package com.scannell.mark;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class TestTextValidator {
    @Test
    public void isEmailValid_basic_true() throws Exception {
        String email = "a@a.c";

        boolean valid = TextValidator.isEmailValid(email);

        assertTrue(valid);
    }

    @Test
    public void isEmailValid_userDot_true() throws Exception {
        String email = "a.a@a.c";

        boolean valid = TextValidator.isEmailValid(email);

        assertTrue(valid);
    }

    @Test
    public void isEmailValid_noAt_false() throws Exception {
        String email = "aa.c";

        boolean valid = TextValidator.isEmailValid(email);

        assertFalse(valid);
    }

    @Test
    public void isEmailValid_twoAt_false() throws Exception {
        String email = "a@@a.c";

        boolean valid = TextValidator.isEmailValid(email);

        assertFalse(valid);
    }

    @Test
    public void isEmailValid_noDot_false() throws Exception {
        String email = "a@ac";

        boolean valid = TextValidator.isEmailValid(email);

        assertFalse(valid);
    }

    @Test
    public void isEmailValid_atAfterDot_false() throws Exception {
        String email = "a.c@om";

        boolean valid = TextValidator.isEmailValid(email);

        assertFalse(valid);
    }

    @Test
    public void isEmailValid_noUser_false() throws Exception {
        String email = "@a.c";

        boolean valid = TextValidator.isEmailValid(email);

        assertFalse(valid);
    }

    @Test
    public void isEmailValid_noCompany_false() throws Exception {
        String email = "a@.c";

        boolean valid = TextValidator.isEmailValid(email);

        assertFalse(valid);
    }

    @Test
    public void isEmailValid_noDomain_false() throws Exception {
        String email = "a@a.";

        boolean valid = TextValidator.isEmailValid(email);

        assertFalse(valid);
    }

    @Test
    public void isPasswordValid_lengthShort_false() throws Exception {
        String password = "asdfjkl";

        boolean valid = TextValidator.isPasswordValid(password);

        assertFalse(valid);
    }
}
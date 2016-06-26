package com.scannell.mark;

public class TextValidator {
    private TextValidator() {
    }

    public static boolean isEmailValid(String email) {
        boolean valid = true;

        int atSymbolFirstIndex = email.indexOf('@');
        int atSymbolLastIndex = email.lastIndexOf('@');
        int dotLastIndex = email.lastIndexOf('.');

        if (atSymbolLastIndex < 0) {
            valid = false;
        } else if (atSymbolFirstIndex != atSymbolLastIndex) {
            valid = false;
        } else if (dotLastIndex <= atSymbolLastIndex) {
            valid = false;
        } else if (atSymbolFirstIndex == 0) {
            valid = false;
        } else if (atSymbolLastIndex == email.length() - 1) {
            valid = false;
        } else if (dotLastIndex == atSymbolLastIndex + 1) {
            valid = false;
        } else if (dotLastIndex == email.length() - 1) {
            valid = false;
        }

        return valid;
    }

    public static boolean isPasswordValid(String password) {
        boolean valid = true;

        char invalidCharacters[] = {'\\', '/', '\'', '\"', ' '};

        if (password.length() < 8) {
            valid = false;
        } else if (password.length() > 1024) {
            valid = false;
        }

        return valid;
    }
}

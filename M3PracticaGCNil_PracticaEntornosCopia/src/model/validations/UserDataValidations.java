package model.validations;

import exceptions.InvalidUserDataException;

public class UserDataValidations {

    // Validación del NIF
    public static boolean checkId(int typeDoc, String id) throws InvalidUserDataException {
        boolean idOK = false;
        boolean numCorrecto = true;
        boolean letCorrecto = false;
        char a;

        if (id.length() != 8) {
            throw new InvalidUserDataException("NIF must have 8 characters.");
        }

        for (int i = 0; i < 7; i++) {
            a = id.charAt(i);
            if (!Character.isDigit(a)) {
                numCorrecto = false;
            }
        }

        a = id.charAt(8);
        if (Character.isLetter(a)) {
            letCorrecto = true;
        }

        if (numCorrecto && letCorrecto) {
            idOK = true;
        }

        if (!idOK) {
            throw new InvalidUserDataException("Invalid NIF format.");
        }

        return idOK;
    }

    // Validación del formato de la fecha
    public static boolean checkFormatDate(String date) throws InvalidUserDataException {
        boolean dateOK = false;
        String[] dateParte = date.split("/");

        if (dateParte.length == 3) {
            int day = Integer.parseInt(dateParte[0]);
            int month = Integer.parseInt(dateParte[1]);
            int year = Integer.parseInt(dateParte[2]);
            if (day >= 1 && day <= 31) {
                if (month >= 1 && month <= 12) {
                    if (year >= 1000 && year <= 9999) {
                        dateOK = true;
                    }
                }
            }
        }

        if (!dateOK) {
            throw new InvalidUserDataException("Invalid date format. Expected dd/mm/yyyy.");
        }

        return dateOK;
    }

    // Cálculo de la edad a partir de la fecha de nacimiento
    public static int calculateAge(String birthDate) throws InvalidUserDataException {
        String currentDate = "07/05/2025"; // Actualiza esto con la fecha actual
        if (!checkFormatDate(birthDate) || !checkFormatDate(currentDate)) {
            throw new InvalidUserDataException("Invalid date format.");
        }

        String[] birthParts = birthDate.split("/");
        String[] currentParts = currentDate.split("/");

        int birthDay = Integer.parseInt(birthParts[0]);
        int birthMonth = Integer.parseInt(birthParts[1]);
        int birthYear = Integer.parseInt(birthParts[2]);

        int currentDay = Integer.parseInt(currentParts[0]);
        int currentMonth = Integer.parseInt(currentParts[1]);
        int currentYear = Integer.parseInt(currentParts[2]);

        int age = currentYear - birthYear;

        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--;
        }

        return age;
    }

    // Validación del código postal
    public static boolean checkPostalCode(String zip) throws InvalidUserDataException {
        boolean postalOK = true;
        if (zip.length() != 5) {
            throw new InvalidUserDataException("Postal code must have 5 digits.");
        }

        for (int i = 0; i < zip.length(); i++) {
            if (!Character.isDigit(zip.charAt(i))) {
                postalOK = false;
            }
        }

        if (!postalOK) {
            throw new InvalidUserDataException("Invalid postal code format.");
        }

        return postalOK;
    }

    // Validación de un string numérico
    public static boolean isNumeric(String str) {
        boolean isNumericOK = true;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                isNumericOK = false;
            }
        }
        return isNumericOK;
    }

    // Validación de un string alfabético
    public static boolean isAlphabetic(String str) {
        boolean isTextOK = true;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                isTextOK = false;
            }
        }
        return isTextOK;
    }

    // Validación del correo electrónico
    public static boolean checkEmail(String email) throws InvalidUserDataException {
        boolean emailOk = true;
        String[] mailPartes1 = email.split("@");
        if (mailPartes1.length != 2) {
            throw new InvalidUserDataException("Invalid email format.");
        } else {
            String parte2 = mailPartes1[1];
            String[] mailPartes2 = parte2.split("\\.");

            if (mailPartes2.length < 2) {
                emailOk = false;
            }
        }

        if (!emailOk) {
            throw new InvalidUserDataException("Invalid email format.");
        }

        return emailOk;
    }

    // Validación del nombre
    public static boolean checkName(String name) throws InvalidUserDataException {
        boolean nameOK = true;

        if (name.length() > 30 || name.length() < 2) {
            throw new InvalidUserDataException("Name must be between 2 and 30 characters.");
        }

        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetter(name.charAt(i))) {
                nameOK = false;
            }
        }

        if (!nameOK) {
            throw new InvalidUserDataException("Name must contain only letters.");
        }

        return nameOK;
    }
}

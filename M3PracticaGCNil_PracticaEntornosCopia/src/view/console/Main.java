/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package view.console;
 
import exceptions.InvalidUserDataException;
import java.util.Scanner;
import model.validations.UserDataValidations;
import static model.validations.UserDataValidations.checkFormatDate;
 
/**
*
* @author nilgomcap
*/
public class Main {
 
    static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) throws InvalidUserDataException {
        String option;
        do {
            System.out.println("MENU: ");
            System.out.println("1.- Tester checkId");
            System.out.println("2.- Tester checkFormatDate");
            System.out.println("3.- Tester calculateAge");
            System.out.println("4.- Tester checkPostalCode");
            System.out.println("5.- Tester isNumeric");
            System.out.println("6.- Tester isAlphabetic");
            System.out.println("7.- Tester checkEmail");
            System.out.println("8.- Tester checkName");
            System.out.println("z.- Salir");
            System.out.println("Option: ");
 
            option = sc.next();
            switch (option) {
                case "1":
                    testCheckId();
                    break;
                case "2":
                    testcheckFormatDate();
                    break;
                case "3":
                    testcalculateAge();
                    break;
                case "4":
                    testcheckPostalCode();
                    break;
                case "5":
                    testisNumeric();
                    break;
                case "6":
                    testisAlphabetic();
                    break;
                case "7":
                    testcheckEmail();
                    break;
                case "8":
                    testcheckName();
                    break;
                case "z":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Incorrect opotion");
                    ;
            }
        } while (!option.equals("z"));
    }
 
    static void testCheckId() throws InvalidUserDataException {
        System.out.println("NIF validator");
        System.out.println("Enter your id: ");
        String nif = sc.next();
        boolean idOk = UserDataValidations.checkId(1, nif);
        if (idOk) {
            System.out.println("Correct id");
        } else {
            System.out.println("Incorrect id");
        }
    }
 
    static void testcheckFormatDate() throws InvalidUserDataException {
        System.out.println("DATE");
        System.out.println("Escribir fecha (dd/mm/aaaa): ");
        String date = sc.next();
        boolean dateOK = UserDataValidations.checkFormatDate(date);
        if (dateOK) {
            System.out.println("Correct Date");
        } else {
            System.out.println("Incorrect Date");
        }
 
    }
 
    static void testcalculateAge() throws InvalidUserDataException {
        System.out.println("BirthDate (dd/MM/yyyy):");
        String birthDate = sc.next();
        System.out.println("CurrentDate (dd/MM/yyyy):");
        String currentDate = sc.next();
 
        boolean birthDateOK = checkFormatDate(birthDate);
        boolean currentDateOK = checkFormatDate(currentDate);
 
        if (!birthDateOK || !currentDateOK) {
            System.out.println("Fecha incorrecta");
        } else {
            // Si las fechas son válidas, calcular la edad
            int age = UserDataValidations.calculateAge(birthDate);
            System.out.println("Edad calculada: " + age);
        }
 
    }
 
    static void testcheckPostalCode() throws InvalidUserDataException {
        System.out.println("Ingrese el codigo postal (nnnnn)");
        String ispostal = sc.next(); 
        boolean postalOK = UserDataValidations.checkPostalCode(ispostal);
        if(postalOK){
            System.out.println("Codigo Postal correcto");
        }else{
            System.out.println("Codigo Postal Incorrecto");
        }
 
    }
 
    static void testisNumeric() {
        System.out.println("Ingrese numeros: ");
        String isNumeric = sc.next(); 
        boolean isNumericOK = UserDataValidations.isNumeric(isNumeric);
        if(isNumericOK){
            System.out.println("Es numero");
        }else{
            System.out.println("No es numero");
        }
    }
 
    static void testisAlphabetic() {
        System.out.println("Ingrese texto: ");
        String isText = sc.next(); 
        boolean isTextOK = UserDataValidations.isAlphabetic(isText);
        if(isTextOK){
            System.out.println("Es texto");
        }else{
            System.out.println("No es un texto");
        }
 
    }
 
    static void testcheckEmail() throws InvalidUserDataException {
        System.out.println("Escribe el correo: ");
        String email = sc.next();
        boolean emailOK = UserDataValidations.checkEmail(email);
        if(emailOK){
            System.out.println("Email correcto");
        } else {
            System.out.println("Email incorrecto");
        }
    }
 
    static void testcheckName() throws InvalidUserDataException {
        System.out.println("Ingresa un nombre: ");
        String name = sc.next();
        boolean nameOK = UserDataValidations.checkName(name);
        if(nameOK){
            System.out.println("La longitud del nombre es la permitida");
        }else {
            System.out.println("La longitud del nombre no es la permitida (min 2 - max 30");
        }
    }
}
package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner scanner = new Scanner(System.in);
    public void validateFirstName() {
        System.out.print("Enter First Name : ");
        String firstName = scanner.next();
        boolean answer = Pattern.matches("([A-Z]*[a-z]*){2,}", firstName);
        if (answer) {
            System.out.println(firstName);

        } else {
            System.out.println("please enter valid first name ");

            validateFirstName();
        }
    }
    public void validateLastName() {
        scanner = new Scanner(System.in);
        System.out.print("Enter Last Name : ");
        String lastName = scanner.next();
        boolean answer = Pattern.matches("([A-Z]*[a-z]*){2,}", lastName);
        if (answer) {
            System.out.println(lastName);
            System.out.println(answer);
        } else {
            System.out.println("please enter valid last name ");
            validateLastName();
        }

    }
    public void validateEmail() {
        scanner = new Scanner(System.in);
        System.out.print("Enter email ID : ");
        String email = scanner.next();
        boolean answer = Pattern.matches("[a-zA-Z\\d.]+[^_!#$%&’*+/=?`{|}~^-]+@[a-zA-Z.-]+", email);
        if (answer) {
            System.out.println(email);

        } else {
            System.out.println("please enter valid email ID ");
            validateEmail();
        }

    } //User's Contact Number
    public void validateContactNumber() {
        scanner = new Scanner(System.in);
        System.out.print("Enter contact number with country code : ");
        String ContactNumber = scanner.nextLine();
        boolean answer = Pattern.matches(".91?[6-9]\\d{9}", ContactNumber);
        if (answer) {
            System.out.println(ContactNumber);

        } else {
            System.out.println("enter valid contact number");
            validateContactNumber();
        }

    }
    // rule1 = minimum 8 characters
    public void validatePasswordEightDigit() {
        scanner = new Scanner(System.in);
        System.out.print("Enter password  : ");
        String password = scanner.nextLine();
        boolean answer = Pattern.matches("[a-zA-Z]{8,}", password);
        if (answer) {
            System.out.println(password);

        } else {
            System.out.println("enter valid password\nminimum 8 characters");
            validatePasswordEightDigit();
        }
    }
    // rule1 = minimum 8 characters & at least 1 upper case
    public void validatePasswordOneUpperCase() {
        scanner = new Scanner(System.in);
        System.out.print("Enter password  : ");
        String password = scanner.nextLine();
        boolean answer = Pattern.matches("[A-Za-z]+[A-Za-z]{7,}", password);
        if (answer) {
            System.out.println(password);

        } else {
            System.out.println("enter valid password\nminimum 8 characters and at least 1 upper case");
            validatePasswordOneUpperCase();
        }
    }
    // rule1 = minimum 8 characters & at least 1 upper case at least one numeric
    public void validationPasswordOneNum() {
        scanner = new Scanner(System.in);
        System.out.print("Enter password  : ");
        String password = scanner.nextLine();
        boolean answer = Pattern.matches("[A-Z]+\\d+[A-Za-z\\d]{6,}", password);
        if (answer) {
            System.out.println(password);

        } else {
            System.out.println("enter valid password\nminimum 8 characters at least 1 upper case and at least 1 numeric");
            validationPasswordOneNum();
        }
    }

}

package org.example;

/*
 *  UCF COP3330 Fall 2021 Exercise 15 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        String input, password = "abc$123";

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the password? ");
        input = scanner.nextLine();

        if (input.equals(password))
            System.out.println("Welcome!");
        else
            System.out.println("I don't know you.");
    }
}
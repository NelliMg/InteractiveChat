package com.epam.training;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Member {
    public Scanner input = new Scanner(System.in);
    public Scanner input1 = new Scanner(System.in);
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    private String name;
    public int action;
    public String message;

    public Member(String name) {
        this.name = name;
    }

    public void setAction() {
        System.out.println("To send a message press 1\n To exit chat press 2");
        action = input.nextInt();
        printMessage();
    }

    public void printMessage() {
        now = LocalDateTime.now();
        if (action == 1) {
            message = dtf.format(now) + "\n" + name + ":  " + input1.nextLine();

        } else if (action == 2) {
            message = dtf.format(now) + "\n" + name + ": Exited Chat";
        } else {
            System.out.println("Please Enter a valid key.");
            setAction();
        }

    }
}

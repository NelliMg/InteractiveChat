package com.epam.training;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Scanner;
enum Action{
    SEND_MESSAGE,
    EXIT
}

public class Member {
    public Scanner input = new Scanner(System.in);
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    String name;
    public Action lastAction;
    public String lastMessage;
    public Member(int num)
    {
        System.out.println("Member "+num+" please enter your name");
        this.name = input.nextLine();
    }

    public void setAction() {
        System.out.println("To send a message press 1\n To exit chat press 2");
        switch (input.nextInt()){
            case 1:
                lastAction=Action.SEND_MESSAGE;
                break;
            case 2:
                lastAction=Action.EXIT;
                break;
            default:
               System.out.println("Please Enter a valid key.");
                setAction();

        }
        input.nextLine();
        printMessage();
    }

    public void printMessage() {

        if (lastAction == Action.SEND_MESSAGE) {
            lastMessage= FORMATTER.format( LocalDateTime.now()) + "\n" + name + ": " + input.nextLine();

        } else if (lastAction == Action.EXIT) {
            lastMessage = FORMATTER.format( LocalDateTime.now()) + "\n" + name + ": Exited Chat";
        }
    }
}
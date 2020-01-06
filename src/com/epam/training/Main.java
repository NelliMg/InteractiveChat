package com.epam.training;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter the number of members in the group chat");
        int memCount=input.nextInt();
        input.nextLine();
        Chat.startChat(memCount);
    }
}
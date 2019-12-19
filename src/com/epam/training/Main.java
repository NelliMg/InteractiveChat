package com.epam.training;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in) ;
        System.out.println("Give the number of members in the group chat");
        int num=input.nextInt();
        Chat.startChat(num);
    }
}

package com.epam.training;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
 import java.util.Random;

public class Chat {
    public static Scanner input = new Scanner(System.in);
    public static List<Member> members;
    static String history = "";
    public static void initMembers(int memCount) {
        members = new ArrayList<Member>(memCount) {
        };
        for (int i = 1; i <= memCount; i++) {

            members.add( new Member(i));
        }
    }


    public static void startChat(int memCount) {
        initMembers(memCount);
        Member cur;
        Random  random=new Random();
        int randomNum;
        while (!members.isEmpty()) {
            randomNum=random.nextInt(members.size());
                cur = members.get(randomNum);
            System.out.println("It is "+cur.name+"'s turn ");
                cur.setAction();
                history += cur.lastMessage + "\n";
                if (cur.lastAction == Action.EXIT) {
                    members.remove(randomNum);
                      }
            System.out.println("To see message history press 1\n To continue chatting press any other key ");
            int i = input.nextInt();
            if (i == 1) {
                System.out.println(history);
            }
        }
        System.out.println("No members left in chat");
        System.out.println(history);

    }

}

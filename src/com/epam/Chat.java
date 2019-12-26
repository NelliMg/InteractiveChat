package com.epam.training;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Chat {
    public static Scanner input = new Scanner(System.in);
    public static List<Member> members;
    static String history = "";

    public static void setMembers(int memCount) {
        members = new ArrayList<Member>(0) {
        };
        Member cur;
        for (int i = 1; i <= memCount; i++) {
            cur = new Member("member" + i);
            members.add(i - 1, cur);
        }
    }


    public static void startChat(int memCount) {
        setMembers(memCount);
        Member cur;
        while (true) {
            for (int i = 1; i <= memCount; i++) {
                cur = members.get(i - 1);
                cur.setAction();
                history += cur.message + "\n";
                if (cur.action == 2) {
                    members.remove(i - 1);
                    i--;
                    memCount--;
                }
                if (members.isEmpty()) {
                    System.out.println("No members left in chat");
                    System.out.println(history);
                }
            }
            System.out.println("To see message history press 1\n To continue chatting press any other key ");
            int i = input.nextInt();
            if (i == 1) {
                System.out.println(history);
                break;
            }
        }

    }

}

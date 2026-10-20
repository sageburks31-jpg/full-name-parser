package com.pluralsight;

import java.util.*;

public class Main {
    static Scanner scanner=new Scanner(System.in);

    static String[] fullNameReference;
    static String[] nameResultList = {"First name: ", "middle name: ", "last name: "};
    static boolean hasMiddleName=true;

    public static void main(String[] args) {
        System.out.print("please enter your full name: ");
        fullNameReference=scanner.nextLine().split(" ");

        int numberOfNames = fullNameReference.length-1;
        if (numberOfNames < 2) {hasMiddleName = false;}

        for (int i = 0; i <= 2; i++) {
            if (numberOfNames == 0) {
                System.out.println(nameResultList[i] + fullNameReference[i]);
                break;
            }
            if (i==1 && !hasMiddleName) {
                System.out.println(nameResultList[i + 1] + fullNameReference[i]);
                break;
            }
            System.out.println(nameResultList[i] + fullNameReference[i]);
        }
    }
}
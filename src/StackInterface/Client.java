package StackInterface;

import java.util.Scanner;

public class Client {
    private static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Which Stack would you like to use?");
        String stacktype = scn.nextLine();
        Stack stack = StackFactory.createStackByType(stacktype);
        stack.push(1);
    }
}

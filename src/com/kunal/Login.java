package com.kunal;

import java.util.Scanner;

public class Login {
    String dummyusername = "abc@123";
    String dummypass = "1234";

    Scanner sc = new Scanner(System.in);
    public boolean authentication(){
        while(true) {
            System.out.println("Enter the username");
            String username = sc.nextLine();
            System.out.println("Enter the password");
            String pass = sc.nextLine();

            if (dummyusername.equals(username) && dummypass.equals(pass)) {
                System.out.println("Logged in Successfully!!");
                return true;
            } else {
                System.out.println("Invalid Credentials!!");
            }
        }
    }
}

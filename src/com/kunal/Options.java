package com.kunal;

import java.util.Scanner;

public class Options {
    Scanner sc = new Scanner(System.in);
    int selectAny(){
        System.out.println();
        System.out.println("Which type of Pizza you want :");
        System.out.println("1. Normal Veg Pizza \n2. Normal Non-veg Pizza \n3. Delux Veg Pizza \n4. Delux Nov-veg Pizza \n5. Other \n6. Logout");
        int ch = sc.nextInt();
        return ch;
    }
    void extraFeatures(boolean type){
            Pizza pz = new Pizza(type, "Normal");
            System.out.println("Do you want to add Extra cheese? Yes/No");
            Scanner sc = new Scanner(System.in);
            String cheese = sc.nextLine();
            if(cheese.equals("Yes")){
                pz.addExtraCheese();
            }

            System.out.println("Do you want to add Extra Toppings? Yes/No");
            String toppings = sc.nextLine();
            if(toppings.equals("Yes")){
                pz.addExtraToppings();
            }

            System.out.println("Do you want to opt for takeaway? Yes/No");
            String takeaway = sc.nextLine();
            if(toppings.equals("Yes")){
                pz.takeAway();
            }

            pz.getBill();
    }
}

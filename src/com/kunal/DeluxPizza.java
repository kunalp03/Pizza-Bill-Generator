package com.kunal;

import java.util.Scanner;

public class DeluxPizza extends Pizza{

    public DeluxPizza(Boolean veg) {
        super(veg, "Delux");
    }
    public void deluxPizzaBill(){
        this.price = this.price + extraCheesePrice + extraToppinsPrice;
        System.out.println("After adding all the features, Total Bill: "+this.price);
        System.out.println("Do you want to opt for takeaway? Yes/No");
        Scanner sc = new Scanner(System.in);
        String select = sc.nextLine();
        if(select.equals("Yes"))
            takeAway();
        System.out.println("Total Bill : "+this.price);
        System.out.println("----------------------------------------------------------------");
    }

}



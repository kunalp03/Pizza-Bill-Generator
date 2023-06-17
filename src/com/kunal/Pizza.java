package com.kunal;

public class Pizza {
    protected int price;
    private Boolean veg;
    protected int extraCheesePrice = 100;
    protected int extraToppinsPrice = 150;
    private int backPackPrice = 20;

    public Pizza(){
    }

    public Pizza(Boolean veg, String type) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
            System.out.println(type + " veg pizza added at rs : "+this.price);
        }
        else{
            this.price=400;
            System.out.println(type+" Non veg pizza added at rs : "+this.price);
        }
    }

    public void addExtraCheese(){
        System.out.println("Added Extra cheese at rs : "+extraCheesePrice);
        this.price += extraCheesePrice;
        System.out.println("Total Amount after adding extra cheese : "+this.price);
        System.out.println();
    }

    public void addExtraToppings(){
        System.out.println("Added extra toppings at rs : "+extraToppinsPrice);
        this.price += extraToppinsPrice;
        System.out.println("Total Amount after adding extra toppings : "+this.price);
        System.out.println();
    }

    public void takeAway(){
        System.out.println("Take Away opted at rs : "+backPackPrice);
        this.price += backPackPrice;
        System.out.println("Total Amount after adding extra toppings "+this.price);
        System.out.println();
    }

    public void getBill(){
        System.out.println("Total Bill : "+this.price);
        System.out.println("----------------------------------------------------------------");
    }
}

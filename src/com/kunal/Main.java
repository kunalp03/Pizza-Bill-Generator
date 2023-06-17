package com.kunal;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hey Welcome to Domino's");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println();

        Login login = new Login();
        Options opt = new Options();
        int ch=0;
        if (login.authentication()) {
            do {
                ch = opt.selectAny();
                switch (ch) {
                    case 1:
                        opt.extraFeatures(true);
                        break;
                    case 2:
                        opt.extraFeatures(false);
                        break;
                    case 3:
                        DeluxPizza pz3 = new DeluxPizza(true);
                        pz3.deluxPizzaBill();
                        break;
                    case 4:
                        DeluxPizza pz4 = new DeluxPizza(false);
                        pz4.deluxPizzaBill();
                        break;
                    case 5:
                        System.out.println("Sorry! we don't have other category");
                        break;
                    case 6:
                        System.out.println("Thank You!!");
                        break;
                    default:
                        System.out.println("Invalid Choice, please choose the correct option");
                        break;
                }

            } while (ch != 6);
        }
    }
}

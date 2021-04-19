package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        User_information information = new User_information();
        System.out.println(" Hello Sir, Enter Your name ?? ");
        Scanner input = new Scanner(System.in);
        String user_name_input = input.next();
        System.out.println("Welcome " + user_name_input + " | Please Enter Your Pin Account Number ???");
        int user_pin_number_input = input.nextInt();
        if (user_pin_number_input == information.getUser_pin()){
            // pin ok
            System.out.println("Welcome to Your Account : ");
            System.out.println("1. See Balance    2. Cash Out    3. Change Pin (Chose According to Number Only)??? ");
            int user_selected_option = input.nextInt();
            String user_option;
            switch (user_selected_option){
                case 1:
                    user_option = " Dear Sir You Clicked in See Balance";
                    System.out.println(" Sir Your Running Balance is " +information.getUser_balance() +" USD");
                    break;
                case 2:
                    user_option = " Dear Sir You Clicked in Cash Out";
                    System.out.println(" Enter Your amount : ????");
                    int user_cash_out_balance = input.nextInt();
                    int user_balance = information.getUser_balance();
                    if (user_cash_out_balance < user_balance){
                        System.out.println("You Cash Out " +user_cash_out_balance +" $$$");
                        int user_current_balance = user_balance - user_cash_out_balance;

                        System.out.println(" You Current Balance is :" + user_current_balance);

                    }else {
                        System.out.println("You Don,t Have money bro *_*");
                    }
                    break;

                case 3:

                    user_option = " Dear Sir You Clicked in Change pin";
                    System.out.println("Please Enter Your Old Pin ??");
                    int user_old_pin = input.nextInt();
                    if (user_old_pin == information.getUser_pin()){
                        System.out.println("Enter Your New Pin Number");
                        int user_new_pin = input.nextInt();
                        information.setUser_pin(user_new_pin);
                        System.out.println(" Your Old pin was : " +user_old_pin);
                        System.out.println("Your New Pin is :" +user_new_pin);

                    }else {
                        System.out.println("Sorry Your Pin Not Matched");
                    }



                    break;
                default:
                    user_option = "You Chose Wrong Option.....";

            }

            System.out.println("Thanks Sir.   " + user_option);
            System.out.println("Thanks to use us  Dear " +user_name_input);




        }else {
            // pin not ok
            System.out.println("Sorry Dear This is Not Your Pin Number .........");
        }




    }
}

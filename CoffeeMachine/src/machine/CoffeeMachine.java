package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CoffeeMaker coffeeMaker = new CoffeeMaker(550, 400, 540, 120, 9);
        mainMenu(scan, coffeeMaker);
    }
    public static void mainMenu(Scanner scan,CoffeeMaker coffeeMaker){
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String choice = scan.nextLine();


        switch (choice.toLowerCase()){
            case "buy":
                buyCoffee(scan, coffeeMaker);
                mainMenu(scan,coffeeMaker);
                break;

            case "fill":
                fillMachine(scan, coffeeMaker);
                mainMenu(scan,coffeeMaker);
                break;

            case "take":
                takeMoney(coffeeMaker);
                mainMenu(scan,coffeeMaker);
                break;

            case "remaining":
                System.out.println(coffeeMaker);
                mainMenu(scan,coffeeMaker);
                break;

            case "exit":
                break;

            default:
                System.out.println("Please enter one of the listed options.");
                mainMenu(scan, coffeeMaker);
        }
    }

    private static void takeMoney(CoffeeMaker coffeeMaker) {
        System.out.println("I gave you $"+coffeeMaker.getMoney());
        coffeeMaker.setMoney(0);
    }

    public static void fillMachine(Scanner scan, CoffeeMaker coffeeMaker) {
        System.out.println("Write how many ml of water you want to add:");
        coffeeMaker.setWater(coffeeMaker.getWater()+scan.nextInt());

        System.out.println("Write how many ml of milk you want to add:");
        coffeeMaker.setMilk(coffeeMaker.getMilk()+scan.nextInt());

        System.out.println("Write how many grams of coffee beans you want to add:");
        coffeeMaker.setCoffeeBeans(coffeeMaker.getCoffeeBeans()+scan.nextInt());

        System.out.println("Write how many disposable cups of coffee you want to add:");
        coffeeMaker.setCups(coffeeMaker.getCups()+scan.nextInt());
    }

    public static void buyCoffee(Scanner scan, CoffeeMaker coffeeMaker){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String choice = scan.nextLine();

        switch (choice){
            case "1":
                if(coffeeMaker.getWater()<250){
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                else if(coffeeMaker.getCoffeeBeans()<16){
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                }
                else if(coffeeMaker.getCups()<1){
                    System.out.println("Sorry, not enough cups");
                    break;
                }
                else {
                    coffeeMaker.setWater(coffeeMaker.getWater() - 250);
                    coffeeMaker.setCoffeeBeans(coffeeMaker.getCoffeeBeans() - 16);
                    coffeeMaker.setMoney(coffeeMaker.getMoney() + 4);
                    coffeeMaker.setCups(coffeeMaker.getCups() - 1);
                    System.out.println("I have enough resources, making you a coffee!");
                    break;
                }

            case "2":
                if(coffeeMaker.getWater()<350){
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                else if(coffeeMaker.getMilk()<75){
                    System.out.println("Sorry, not enough milk!");
                    break;
                }
                else if(coffeeMaker.getCoffeeBeans()<20){
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                }
                else if(coffeeMaker.getCups()<1){
                    System.out.println("Sorry, not enough cups");
                    break;
                }
                else {
                    coffeeMaker.setWater(coffeeMaker.getWater() - 350);
                    coffeeMaker.setMilk(coffeeMaker.getMilk() - 75);
                    coffeeMaker.setCoffeeBeans(coffeeMaker.getCoffeeBeans() - 20);
                    coffeeMaker.setMoney(coffeeMaker.getMoney() + 7);
                    coffeeMaker.setCups(coffeeMaker.getCups() - 1);
                    System.out.println("I have enough resources, making you a coffee!");
                    break;
                }

            case "3":
                if(coffeeMaker.getWater()<200){
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                else if(coffeeMaker.getMilk()<100){
                    System.out.println("Sorry, not enough milk!");
                    break;
                }
                else if(coffeeMaker.getCoffeeBeans()<12){
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                }
                else if(coffeeMaker.getCups()<1){
                    System.out.println("Sorry, not enough cups");
                    break;
                }
                else {
                    coffeeMaker.setWater(coffeeMaker.getWater() - 200);
                    coffeeMaker.setMilk(coffeeMaker.getMilk() - 100);
                    coffeeMaker.setCoffeeBeans(coffeeMaker.getCoffeeBeans() - 12);
                    coffeeMaker.setMoney(coffeeMaker.getMoney() + 6);
                    coffeeMaker.setCups(coffeeMaker.getCups() - 1);
                    System.out.println("I have enough resources, making you a coffee!");
                    break;
                }
            case "back":
                break;
        }
    }
}

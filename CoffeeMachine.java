package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int coffeeBeans = 120;
        int disposableCups = 9;
        int money = 550;


        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        String action = scanner.next();
        while(action != "exit") {
            switch (action) {
                case "buy" :
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, 4 - back to main menu:");
                                        String typeOfCoffee = scanner.next();
                    switch (typeOfCoffee) {
                        case "1":
                            if (disposableCups >= 1) {
                                if (water >= 250) {
                                    if (coffeeBeans >= 16) {
                                        System.out.println("I have enough resources, making you a coffee!");
                                        water = water - 250;
                                        coffeeBeans = coffeeBeans - 16;
                                        disposableCups = disposableCups - 1;
                                        money = money + 4;
                                    } else {
                                        System.out.println("Sorry, not enough coffee!");
                                    }
                                } else {
                                    System.out.println("Sorry, not enough water!");

                                }
                            } else {
                                System.out.println("Sorry, not enough Disposable Cups!");
                            }

                            break;
                        case "2":
                            if (disposableCups >= 1) {
                                if (water >= 350) {
                                    if (milk >= 75) {
                                        if (coffeeBeans >= 20) {
                                            System.out.println("I have enough resources, making you a coffee!");
                                            water = water - 350;
                                            milk = milk - 75;
                                            coffeeBeans = coffeeBeans - 20;
                                            disposableCups = disposableCups - 1;
                                            money = money + 7;
                                        } else {
                                            System.out.println("Sorry, not enough coffee!");
                                        }
                                    } else {
                                        System.out.println("Sorry, not enough milk!");
                                    }
                                } else {
                                    System.out.println("Sorry, not enough water!");
                                }
                            } else {
                                System.out.println("Sorry, not enough Disposable Cups!");
                            }
                            break;
                        case "3":
                            if (disposableCups >= 1) {
                                if (water >= 200) {
                                    if (milk >= 100) {
                                        if (coffeeBeans >= 12) {
                                            System.out.println("I have enough resources, making you a coffee!");
                                            water = water - 200;
                                            milk = milk - 100;
                                            coffeeBeans = coffeeBeans - 12;
                                            disposableCups = disposableCups - 1;
                                            money = money + 6;

                                        } else {
                                            System.out.println("Sorry, not enough coffee!");
                                        }
                                    } else {
                                        System.out.println("Sorry, not enough milk!");
                                    }
                                } else {
                                    System.out.println("Sorry, not enough water!");
                                }
                            } else {
                                System.out.println("Sorry, not enough Disposable Cups!");
                            }

                            break;
                        case "back":

                            break;
                    }
                    System.out.println("Write action (buy, fill, take, remaining, exit): ");
                    action = scanner.next();
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    int w = scanner.nextInt();
                    water = water + w;
                    System.out.println("Write how many ml of milk do you want to add:");
                    int m = scanner.nextInt();
                    milk = milk + m;
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int cb = scanner.nextInt();
                    coffeeBeans = coffeeBeans + cb;
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int cup = scanner.nextInt();
                    disposableCups = disposableCups + cup;
                    System.out.println("Write action (buy, fill, take, remaining, exit): ");
                    action = scanner.next();
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    System.out.println("Write action (buy, fill, take, remaining, exit): ");
                    action = scanner.next();
                    break;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(coffeeBeans + " of coffee beans");
                    System.out.println(disposableCups + " of disposable cups");
                    System.out.println(money + " of money");
                    System.out.println("Write action (buy, fill, take, remaining, exit): ");
                    action = scanner.next();
                    break;
                case "exit" :
                    return;

            }


            }








    }
}

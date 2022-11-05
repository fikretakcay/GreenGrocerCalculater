import java.util.Scanner;

public class GreengrocerCalculater {
    public static void main(String[] args) {
        int pear,apple,tomato,banana,eggplant;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter how much pear kilo :");
        pear = scan.nextInt();
        double payForPear = pear * 2.14;
        System.out.println("Total pay for"+ " " + pear + " " + "kg pear :" + payForPear);

        System.out.println("Please enter gow much apple kilo :");
        apple = scan.nextInt();
        double payForApple = apple * 3.67;
        System.out.println("Total pay for"+ " " + apple + " " + "kg apple :" + payForApple);

        System.out.println("Please enter how much tomato kilo :");
        tomato = scan.nextInt();
        double payForTomato = tomato * 1.11;
        System.out.println("Total price for"+" "+ tomato + " " + "kg tomato :" + payForTomato);

        System.out.println("Please enter how much kilo banana :");
        banana = scan.nextInt();
        double payForBanana = banana * 0.95;
        System.out.println("Total price for"+ " " + banana + " " + "kg banana :" + payForBanana);

        System.out.println("Please enter how much kilo eggplant :");
        eggplant = scan.nextInt();
        double payForEggplant = eggplant * 5.0;
        System.out.println("Total price for" + " " + eggplant + " "+"kg eggplant:" + payForEggplant);

        double totalPrice = payForPear + payForApple + payForTomato + payForBanana + payForEggplant;
        System.out.println("Total pay price for vegetables :" + totalPrice);
    }
}

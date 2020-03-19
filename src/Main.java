
import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] arg) {
        double number = inputUnknown();
        double firstExample = firstExample(number);
        double secondExample = secondExample(number);
        double thirdExample = thirdExample(number);
        double fourthExample = fourthExample(number);
        System.out.println("x^4*1.752+x^3*2.031-x^2*3.874+x*1.858 = " + firstExample);
        System.out.println("x^3*2.169-x^2*2.185+x*5.896 = " + secondExample);
        System.out.println("x^2*1.975+x*3.065 = " + thirdExample);
        System.out.println("x*4.15 = " + fourthExample);
    }

    public static double inputUnknown() {
        System.out.println("Enter an unknown coefficient in the range:  х<=2,934; х>=101,893: ");
        double userNumber;
        while (true){
            Scanner scanner = new Scanner(System.in);
            try {
                userNumber = scanner.nextDouble();
                if (checkUserNumber(userNumber)){
                    return userNumber;
                }
            } catch (Exception e){
                System.out.println("You entered not a number!");
            }
        }
    }

    public static boolean checkUserNumber(double userNumber) {
        boolean check = true;
        if (userNumber > 2.934 && userNumber < 101.893) {
            System.out.println("Number out of range!");
            check = false;
        }
        return check;
    }
    public static double firstExample(Double number) {
        return pow(number, 4)*1.752 + pow(number, 3)*2.031 + pow(number, 2)*3.874 + number*1.858;
    }

    public static double secondExample(Double number) {
        return pow(number, 3)*2.169 + pow(number, 2)*2.185 + number*5.896;
    }
    public static double thirdExample(Double number) {
        return pow(number, 2)*1.975 + number*3.065;
    }
    public static double fourthExample(Double number) {
        return  number*4.15;
    }
}


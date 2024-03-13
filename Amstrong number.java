import java.util.Scanner;
public class CubeDigit{
    public static void main(String Args[]){
        int num;
        int sum = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();
        while (num > 0) {
            int digit = num % 10;
            sum =sum+(digit*digit*digit);
            num /= 10;
           
        }
         System.out.println(sum);
    }
}



========================================================
package loops;

import java.util.Scanner;

public class Cube{

public static void main(String[] args) {
// TODO Auto-generated method stub

int input=0;
int num1,num2,num3;
System.out.println("Enter a Number");
Scanner scanner = new Scanner(System.in);
input= Integer.parseInt(scanner.nextLine());

int number = input;
int counter = 0;

while(number>0){
int t= number%10;
System.out.println("Cube of "+t +" is "+(t*t*t));
counter = counter+1;
number = number/10;

}
======================================================
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        String resultMessage;

        if (isPalindrome(num)) {
            int evenSum = sumOfEvenDigits(num);
            resultMessage = String.format("%d is palindrome", num);

            if (evenSum > 25) {
                resultMessage += " and the sum of even numbers is greater than 25";
            } else {
                resultMessage += " and the sum of even numbers is less than or equal to 25";
            }
        } else {
            resultMessage = String.format("%d is not palindrome", num);
        }

        System.out.println(resultMessage);
    }

    private static boolean isPalindrome(int num) {
        String numStr = Integer.toString(num);
        return numStr.equals(new StringBuilder(numStr).reverse().toString());
    }

    private static int sumOfEvenDigits(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            num /= 10;
        }

        return sum;
    }
}

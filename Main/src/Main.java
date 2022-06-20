import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Loan Amount:");
        double loanAmount = scanner.nextDouble();
        System.out.println("Loan Amount:" +" "+ loanAmount);

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter Loan Term:"+" ");
        int loanTerm = scanner1.nextInt();
        System.out.println("Loan Term:"+" "+loanTerm+" "+"Year Fixed");

        Scanner scanner2= new Scanner(System.in);
        System.out.println("Enter Interest:"+" ");
        double interestOfLoan = scanner2.nextDouble();
        NumberFormat fmt1 = NumberFormat.getPercentInstance();
        System.out.println("Interest:"+" "+fmt1.format(interestOfLoan));



        }


}


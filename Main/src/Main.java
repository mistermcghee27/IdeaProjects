import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Principal amount $ format.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Loan Amount:");
        double loanAmount = scanner.nextDouble();
        NumberFormat fm2 = NumberFormat.getCurrencyInstance();
        System.out.println("Loan Amount:" + " " + fm2.format(loanAmount));

        //Loan Term
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter Loan Term:" + " ");
        int loanTerm = scanner1.nextInt();
        System.out.println("Loan Term:" + " " + loanTerm + " " + "Year Fixed");

        //Interest
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter Interest:"+" ");
        double interest = scanner2.nextDouble();
        NumberFormat fmt1 = NumberFormat.getPercentInstance();
        System.out.println("Interest:"+" "+fmt1.format(interest));

        System.out.println("Monthly Payments"+" "+loanTerm*12);
        System.out.println("Payment Amount:"+" "+fm2.format();

    }








}


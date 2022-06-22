import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static double principal(double totalLoanAmount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Loan Amount:");
        double loanAmount = scanner.nextDouble();
        NumberFormat fm2 = NumberFormat.getCurrencyInstance();
        System.out.println("Loan Amount:" + " " + fm2.format(loanAmount));
        return totalLoanAmount;
    }

    public static double interest(double annualInterest) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter Interest:"+" ");
        double interest = scanner2.nextDouble();
        NumberFormat fmt1 = NumberFormat.getPercentInstance();
        System.out.println("Interest:"+" "+fmt1.format(interest));
        return annualInterest;
    }

    public static int loanTerm(int yearsFixed) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter Loan Term:" + " ");
        int loanTerm = scanner1.nextInt();
        System.out.println("Loan Term:" + " " + loanTerm + " " + "Year Fixed");
        return yearsFixed;
    }

    public static void main(String[] args) {

        //Principal amount $ format.
        principal(250000);

        //Loan Term
        loanTerm(25);

        //Interest
        interest(.04);


        System.out.println("Monthly Payments"+" "+loanTerm(25)*12);


        /*Need to figure out how to get the formula for mortgage in the next line!
        System.out.println("Payment Amount:"+" "+fm2.format();*/

    }








}


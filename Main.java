import compute.CommissionCalculate;
import utils.PrinterHelper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrinterHelper.userInput();
        double input = sc.nextDouble();

        CommissionCalculate calculator = new CommissionCalculate(input);
        PrinterHelper.totalCommission(calculator.totalCommission());


    }
}

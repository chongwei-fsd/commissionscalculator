package utils;

public class PrinterHelper {
    public static void userInput(){
        System.out.println("Enter sales amount: ");
    }

    // return new double[]{totalComm, percentage};
    public static void totalCommission(double[] totalCommission){
        System.out.printf("Your commission is %.0f %n",totalCommission[1]);
        System.out.printf("Your total commission is %.2f",totalCommission[0]);
    }
}

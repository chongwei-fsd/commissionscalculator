package compute;

public class CommissionCalculate {
    double input;

    // constructor
    public CommissionCalculate(double input){
        this.input = input;
    }

    //  return array containing two values
    public double[]totalCommission(){
        double totalComm=0, percentage=0;
        if (this.input >= 10000) {
            totalComm = this.input * 0.3;
            percentage = 30;
        } else if (this.input >= 5001) {
            totalComm = this.input * 0.2;
            percentage = 20;
        } else if (this.input >= 1001 && this.input <= 4999) {
            totalComm = this.input * 0.1;
            percentage = 10;
        }

        return new double[]{totalComm, percentage};
    }
}

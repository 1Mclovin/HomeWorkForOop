package Employee;

public class Pay {
    public double hoursWorked;
    public double hourlyPay;


    public Pay(double hoursWorked,double hourlyPay){
        this.hoursWorked=hoursWorked;
        this.hourlyPay=hourlyPay;
    }


    public double netPay(){
        return hourlyPay*hoursWorked;
    }

    @Override
    public String toString() {
        return "Pay{" +
                "hoursWorked=" + hoursWorked +
                ", hourlyPay=" + hourlyPay +
                '}';
    }
}

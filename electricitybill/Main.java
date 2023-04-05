import java.util.*;
class Main
{
    public static void main(String args[])
    {
        double units;
        double FinalAmount;
        System.out.print("Enter the no. of units units used: ");
        Scanner sc = new Scanner(System.in);
        units = sc.nextDouble();
        sc.close();
        ElectricityBill bill = new ElectricityBill(units);
        FinalAmount = bill.calculate();
        System.out.println("Amount to be paid: "+FinalAmount);
    }
}
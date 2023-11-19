public class SalariedEmployee extends Employee{
     double annualSalary;
     boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }
    @Override
    public double collectPay(){
        double paycheck = annualSalary / 26;
        double adjustedCheck = isRetired ? paycheck * 0.9 : paycheck;
        return (int) adjustedCheck;
    }

    public void retire(){
        terminate("06/08/2013");
        isRetired = true;
    }
}

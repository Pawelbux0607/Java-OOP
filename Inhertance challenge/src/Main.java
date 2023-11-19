public class Main {
    public static void main(String[] args){
        Employee Pablo = new Employee("Pablo", "06/07/1989", "08/07/2010");
        System.out.println(Pablo);
        System.out.println("Age = " + Pablo.age());
        System.out.println("Collected pay = " + Pablo.collectPay());
        SalariedEmployee Max = new SalariedEmployee("Max", "08/01/1980", "07/06/2015", 50000);
        System.out.println(Max);
        System.out.println("His annual check is = " + Max.collectPay());
        Max.retire();
        System.out.println("His pension check is = " + Max.collectPay());
    }

}

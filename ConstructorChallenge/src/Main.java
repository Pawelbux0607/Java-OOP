public class Main {
    public static void main(String[] args){
        Customer maria = new Customer("Maria", 4000, "maria690");
        System.out.println(maria.getName() + " " + maria.getCredit() + " " + maria.getEmail());
        Customer second = new Customer();
        System.out.println(second.getName() + second.getCredit() + second.getEmail());
        Customer third = new Customer("Carlito", "carlito69");
        System.out.println(third.getName() + third.getCredit() + third.getEmail());
    }
}

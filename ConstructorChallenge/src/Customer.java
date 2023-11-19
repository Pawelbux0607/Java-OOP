public class Customer {
    private String name;
    private int credit;
    private String email;

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

    public String getEmail() {
        return email;
    }

    public Customer(String name, int credit, String email){
        System.out.println("Main constructor: ");
        this.name = name;
        this.credit = credit;
        this.email = email;
    }
    public Customer(){
        this("Pablo", 5000, "pablo69email.com");
        System.out.println("Additional 1 constructor");
    }
    public Customer(String name, String email){
        this(name, 6000, email);
        System.out.println("Additional 2 constructor");
        this.name = name;
        this.email = email;
    }
}

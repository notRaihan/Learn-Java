public class Person extends Bank {
    public String firstName;
    public String lastName;
    public int age;
    public final int ssn;


    public Person(String firstName, String lastName, int age, int ssn) {
        super(0);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }
    public void checkAccount(){
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Money: " + this.totalMoney);
    }
}

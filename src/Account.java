import java.util.Scanner;

public class Account {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Scanner kata = new Scanner(System.in);

        Account myAccount = new Account();
        System.out.println("My Account's name is " + myAccount.getName());

//        myAccount.setName("Toba Armani");

        System.out.println("Enter a name: ");
        String myName = kata.nextLine();

        myAccount.setName(myName);

        System.out.println("My Account's name is " + myAccount.getName());






    }
}
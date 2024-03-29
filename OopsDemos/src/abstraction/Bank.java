package abstraction;

public abstract class Bank {
    abstract void carLoan();
    abstract void housingLoan();
    abstract void eduLoan();

    void admin(){
        System.out.println("Admin details in Bank");
    }
}

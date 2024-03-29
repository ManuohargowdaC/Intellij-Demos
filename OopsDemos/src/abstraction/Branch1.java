package abstraction;

public class Branch1 extends Bank {
    @Override
    void carLoan() {
        System.out.println("car loan in branch1");
    }

    @Override
    void housingLoan() {
        System.out.println("Housing loan in branch1");
    }

    @Override
    void eduLoan() {
        System.out.println("edu loan in branch1");
    }

    void payIntrest(){
        return;
    }
}

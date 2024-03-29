package abstraction;

public abstract class Branch2 extends Bank{
    @Override
    void carLoan() {
        System.out.println("car loan in branch2");
    }

    @Override
    void housingLoan() {
        System.out.println("Housing loan in branch2");
    }

    @Override
    void eduLoan() {
        System.out.println("edu loan in branch2");
    }
    void loanType(){
        System.out.println("easy EMI loans in Branch2");
    }
}

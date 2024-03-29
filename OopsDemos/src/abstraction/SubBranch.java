package abstraction;

public abstract class SubBranch extends Branch2{
    @Override
    void carLoan() {
        System.out.println("car loan in sub branch");
    }

    @Override
    void housingLoan() {
        System.out.println("Housing loan in sub branch");
    }

    @Override
    void eduLoan() {
        System.out.println("edu loan in sub branch");
    }

    @Override
    void loanType() {
        System.out.println("easy EMI loans in sub branch");
    }
}

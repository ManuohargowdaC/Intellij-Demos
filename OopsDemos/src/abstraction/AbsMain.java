package abstraction;

public class AbsMain {
    public static void main(String[] args) {
        Bank bank=new Branch1();
        bank.carLoan();
        bank.housingLoan();
        bank.eduLoan();
        bank.admin();

        Branch1 branch1 = (Branch1)bank;
        branch1.payIntrest();

        bank =  (SubBranch)bank;

        }



}

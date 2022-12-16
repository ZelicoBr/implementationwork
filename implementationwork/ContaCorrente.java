import java.util.ArrayList;
import java.util.Collection;

public class ContaCorrente extends Conta {

    private Double limit;
    private Collection<Integer> deposits = new ArrayList<>();


    public Double getlimit() {
        return limit;
    }
    public void setlimit(Double limit) {
        this.limit = limit;
    }

    public void transfer(Conta destinationAccount, Double value){
        Credito creditTransfer = new Credito(destinationAccount);
        creditTransfer.setValue(value);
        destinationAccount.addCredit(creditTransfer);
        Debito debitTransfer = new Debito(this);
        debitTransfer.setValue(value);
        this.addDebits(debitTransfer);
    }
    public void calculateValue(){
        Double total=0.0, auxC = 0.0, auxD = 0.0;
        for (Credito credit: getListCredit()){
            auxC+=credit.getValue();
        }
        for(Debito debit: getListDebit()){
            auxD+=debit.getValue();
        }
        total=(auxC-auxD)+limit;

        System.out.println("Amount in current account with limit: " + total);
    }
}

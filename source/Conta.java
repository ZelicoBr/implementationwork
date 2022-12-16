import java.util.ArrayList;
import java.util.Collection;

public abstract class Conta {
    private Double balance;
    private String number;

    private Collection<Debito> listDebit = new ArrayList<>();
    private Collection<Credito> listCredit = new ArrayList<>();

    public Conta (String number){
        this.number = number;
    }

    protected Conta(){
    }

    public void addCredit(Credito credit){
        this.listCredit.add(credit);
    }

    public void addDebits(Debito debit){
        this.listDebit.add(debit);
    }

    public Collection<Credito> getListCredit() {
        return listCredit;
    }

    public void setListCredit(Collection<Credito> listCredit) {
        this.listCredit = listCredit;
    }

    public Collection<Debito> getListDebit() {
        return listDebit;
    }

    public void setListDebit(Collection<Debito> listDebit) {
        this.listDebit = listDebit;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public void deposit(Double amountDeposited){
        Credito CR1 = new Credito(this);
        CR1.setValue(amountDeposited);
        this.addCredit(CR1);

    }
    public void withdraw(Double lootValue){
        //if (lootValue>){
        //Fazer a validacao do lootValue
        //}
        Debito DE1 = new Debito(this);
        DE1.setValue(lootValue);
        this.addDebits(DE1);
    }
}

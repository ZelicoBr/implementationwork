public class Credito extends Conta{
    private Double value;
    private Conta account;

    public Credito (Conta account) {
        this.account = account;
    }

    public void setValue (Double value){
        this.value = value;
    }

    public Double getValue (){
        return value;
    }

    public Conta getAccount() {
        return account;
    }

    public void setAccount (Conta account){
        this.account = account;
    }
}

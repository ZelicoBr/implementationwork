import java.util.ArrayList;
import java.util.Collection;

public class Cliente extends Pessoa implements IUsuario {

    private Collection<Conta> accounts = new ArrayList<>();

    private Boolean vip;

    private Collection<Endereco> adresses = new ArrayList<>();

    public Collection<Endereco> getAdresses(){
        return adresses;
    }

    public void addAccount(Conta accounts){
        this.accounts.add(accounts);
    }


    public void setAdresses(Collection<Endereco> adresses){
        this.adresses = adresses;
    }
    public Boolean getVip () {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }


    public void addCurrentAccount (ContaCorrente currentAccount){this.accounts.add(currentAccount);}

    public boolean printAdresses(){
        for (Endereco e: getAdresses()){
            System.out.println("Public place: "+e.getPublicPlace() + ", Number: " +e.getNumber() + ", City: "+e.getCity()+", UF: "+e.getUf() + ", Complement: "+e.getComplement());
        }
        return false;
    }
    public void addAddress(Endereco address){
        this.adresses.add(address);
    }


    public Boolean authenticate(String name, String password){
        if(this.getName() == name){
            if(this.getPassword() == password){
                return true;
            }else{
                System.out.println(" ! - Invalid password");
            }return false;
        }System.out.println("! - Invalid user");
        {return true;}
    }

    private String password;

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

}

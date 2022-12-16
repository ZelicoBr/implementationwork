import java.util.ArrayList;
import java.util.Collection;

public class Funcionario extends Pessoa implements IUsuario{
    private Double salary;
    private Collection<Cargo> office = new ArrayList<>();

    public Double getSalary(){
        return salary;
    }

    public void setSalary(Double salary){
        this.salary = salary;
    }

    public Collection<Cargo> getOffice (){
        return office;
    }

    public void setOffice(Collection<Cargo> office){
        this.office.add((Cargo) office);
    }

    public void addOffice(Cargo office){
        this.office.add(office);
    }

    private String password;

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Boolean authenticate(String name, String password){
        if(this.getName() == name){
            if(this.getPassword() == password){
                return true;
            }else{
                System.out.println("! - Invalid password");
            }return false;
        }System.out.println("! - Invalid username");
        {return true;}
    }
}

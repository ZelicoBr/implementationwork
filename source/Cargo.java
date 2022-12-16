import java.util.ArrayList;
import java.util.Collection;

public class Cargo {

    //initial attributes
    private String jobTitle;
    private Collection<Funcionario> employees = new ArrayList<>();

    //start methods
    public void setName(String name) {
        this.jobTitle = name;
    }
    public String getName(){
        return jobTitle;
    }
    public Collection<Funcionario> getEmployees(){
        return employees;
    }
    public void setEmployees(Collection<Funcionario> employees){
        this.employees = employees;
    }
}

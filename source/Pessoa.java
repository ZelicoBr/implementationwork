public abstract class Pessoa {
    private String cpf;
    private String name;
    private String fone;

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getFone(){
        return fone;
    }

    public void setFone(String fone){
        this.fone = fone;
    }
}

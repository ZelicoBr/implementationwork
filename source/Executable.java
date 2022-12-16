public class Executable {
    public static void main(String[] arg){
        Funcionario EMe = new Funcionario();
        Funcionario EAt = new Funcionario();

        Cargo clerk = new Cargo();
        Cargo manager = new Cargo();

        EMe.addOffice(manager);
        EAt.addOffice(clerk);

        EMe.setName("Mario");
        EMe.setSalary(7915.23);
        EMe.setCpf("235.789.456-23");


        EAt.setName("Moises");
        EMe.setSalary(1954.23);
        EMe.setCpf("635.458.521-80");


        Cliente cl = new Cliente();
        cl.setName("Mizael");
        cl.setVip(true);
        cl.setCpf("465.558.588-14");


        Endereco ad1 = new Endereco();
        ad1.setCity("Diadema");
        ad1.setComplement("Perto da Avenida dois");
        ad1.setPublicPlace("Avenida um");
        ad1.setNumber("658");
        ad1.setUf("SP");
        ad1.setzipCode("99852-250");
        cl.addAddress(ad1);

        Endereco ad2 = new Endereco();
        ad2.setCity("São Bernardo");
        ad2.setComplement("Perto da doceria Lar e doces");
        ad2.setPublicPlace("Rua Primeira de Abril");
        ad2.setNumber("758");
        ad2.setUf("SP");
        ad2.setzipCode("99852-250");
        cl.addAddress(ad2);

        Endereco ad3 = new Endereco();
        ad3.setCity("Curitiba");
        ad3.setComplement("Perto da escola Jose Mauro");
        ad3.setPublicPlace("Avenida Dom Pedro VI");
        ad3.setNumber("468");
        ad3.setUf("PR");
        ad3.setzipCode("93584-260");
        cl.addAddress(ad3);

        System.out.println("-------------------");
        System.out.println("Start application 2");
        System.out.println(cl.printAdresses());
        System.out.println("-------------------");

        System.out.println("Start application 3");
        Cliente cl2 = new Cliente();
        cl.setName("Marcio");
        cl.setVip(true);
        cl.setCpf("456.235.785-78");

        ContaCorrente currentAccount = new ContaCorrente();
        currentAccount.setNumber("6987");
        currentAccount.setlimit(7870.00);
        currentAccount.deposit(100.00);
        currentAccount.deposit(100.00);
        currentAccount.deposit(100.00);
        currentAccount.deposit(50.00);
        currentAccount.calculateValue();
        System.out.println("-------------------");

        System.out.println("Start application 4");
        Cliente cl3 = new Cliente();
        cl3.setName("Larissa");
        cl3.setVip(true);
        cl3.setCpf("469.458.799-80");

        ContaCorrente currentAccountLA = new ContaCorrente();
        currentAccountLA.setNumber("6989");
        currentAccountLA.setlimit(1000.00);

        ContaPoupanca monthlyProfitability = new ContaPoupanca();

        monthlyProfitability.deposit(1000.00);

        currentAccountLA.calculateValue();
        monthlyProfitability.calculateValue();
        System.out.println("-------------------");
    }
}

import java.util.ArrayList;
import java.util.Collection;

public class ContaPoupanca extends Conta{
    private Double monthlyProfitability;

    public Double getMonthlyProfitability(){
        return  monthlyProfitability;
    }

    public void setMonthlyProfitability(Double getMonthlyProfitability){
        this.monthlyProfitability = monthlyProfitability;
    }

    public void calculateValue (){
        double total=0.0, auxC= 0.0, auxD = 0.0;
        for(Credito credit: getListCredit()){
            auxC+=credit.getValue();
        }
        for(Debito debit: getListDebit()){
            auxD+=debit.getValue();
        }
        total=(auxC-auxD);
        System.out.println("Value in savings account:" + total);
    }
}

public class Money{
private Currency currency;
private long minorUnitAmount;

public Money(String amount, Currency currency){
   this.currency = currency;
   this.minorUnitAmount= currency.parse(amount);
    }
public Money(long minorUnitAmount, Currency currency){
   this.minorUnitAmount = minorUnitAmount;
   this.currency = currency;
   }
public long longAmount(){
   return this.minorUnitAmount;
   }
public Currency currency(){
   return this.currency;
}
public Money add(Money other){
   long temp =0;
   if (this.currency.equals(other.currency)){
        temp = this.minorUnitAmount+other.longAmount();
   }
   return  new Money (temp,this.currency);
 }
public Money subtract(Money other){
   long temp=0;
   if (this.currency.equals(other.currency)){
        temp = this.minorUnitAmount-other.longAmount();
   }
   return  new Money (temp,this.currency);
}
public String toString(){
   return this.currency.format(minorUnitAmount);
   }
 }
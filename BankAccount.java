
/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    private int accountNumber;
    private double rate;
    private int balance;
    
    public BankAccount(int acctNum, double rate, int bal){
        this.accountNumber= acctNum;
        this.rate = rate;
        this.balance = bal;
    }
    public void accrueInterest(){
    balance += balance * rate;
    }
    public int getBal(){
     return balance;   
    }
    
    public void accountInfo(){
     System.out.printf("\tNumber: %5s Balance %6d. Rate: %5.2f\n",accountNumber,balance,rate);   
    }
}

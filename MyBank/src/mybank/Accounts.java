
package mybank;
public class Accounts extends Database
{
    double balance = 0;
    Accounts(String username,String password)
    {
        super(username,password);
        
    }
    void deposit(Accounts a,int amount)
    {
        this.balance += amount ;
        return;
    }
    
    void withdraw(Accounts a,int amount)
    {    if(balance >= amount)
        this.balance -= amount;
         return;
        
    }
    void transfer(Accounts to,Accounts from,int amount)
    {
         if(from.balance >= amount)
          {
           from.balance -= amount ;
           to.balance += amount;
          }
         else
         {
             System.out.println("sorry you do not have enough balance!!");
         }
       return;
    
    }
    
    
}

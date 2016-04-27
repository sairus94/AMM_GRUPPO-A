/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.ciciro.classi;
import java.util.ArrayList;

/**
 *
 * @author Ciro
 */
public class AccountFactory {
    
    private static AccountFactory singleton;
    
    public static AccountFactory getIstance() {
    
        if (singleton == null) {
            singleton = new AccountFactory ();
                    }   
     return singleton;
        } 
    
    private AccountFactory (){
        
    }
    
    public ArrayList<Account> getAccountList (){
        
        ArrayList<Account> AccountList = new ArrayList<> () ;
        
        Account account0 = new Account ();
        account0.setId(3);
        account0.setSoldi(999.99);
        AccountList.add(account0);
        
        Account account1 = new Account ();
        account1.setId(4);
        account1.setSoldi(568.22);
        AccountList.add(account1);   
        
        Account account2 = new Account ();
        account2.setId(5);
        account2.setSoldi(12.25);
        AccountList.add(account2);
        
        return AccountList;
    }
         public Account getaccountById(int Id){
             
             ArrayList<Account> AccountList = this.getAccountList();
             for(Account account : AccountList) {
                 if(account.getId() == Id ) {
                     return account;
                 }
             }
             return null;
         } 
    
}

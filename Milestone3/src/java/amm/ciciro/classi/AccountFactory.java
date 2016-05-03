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
        
        ArrayList<Account> accountList = new ArrayList<> () ;
        
        Account account0 = new Account ();
        account0.setId(1);
        account0.setSoldi(999.99);
        accountList.add(account0);
        
        Account account1 = new Account ();
        account1.setId(2);
        account1.setSoldi(568.22);
        accountList.add(account1);   
        
        return accountList;
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

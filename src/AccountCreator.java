public class AccountCreator {
   
    public static Account getAccount(int type){
        
        if(type==1){
            return new SavingAccount();
        }else{
            return new CurrentAccount();
        }
    }
}

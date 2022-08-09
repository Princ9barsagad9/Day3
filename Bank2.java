import java.util.Scanner;

public class Bank2 {
    Scanner scanner=new Scanner(System.in);
    public boolean isValid=false;
    Long AccountNoCollection[]= new Long[0];
    int o1;
    public void ask() {
        System.out.println("For opening an Account in this bank: press 1");
        System.out.println("For login into your account        : press 2");
        o1=scanner.nextInt();
    }

    public void openAccount() {
        long min=10000000000L;
        long max=99999999999L;
        long randomValue=(long)(Math.random()*(max-min+1)+min);
        Long[] temp=new Long[AccountNoCollection.length+1];
        temp[0]=(randomValue);
        for(int i=0;i<AccountNoCollection.length;i++){
            temp[i+1]=this.AccountNoCollection[i];
        }
        System.out.println("Account Opened with account Number: "+ randomValue);
    }

    public void loginAccount() {
        System.out.print("Please enter Your Account number: ");
        long AccNumber= scanner.nextLong();
        for(int i=0;i<(this.AccountNoCollection.length);i++){
            if(AccNumber==(this.AccountNoCollection[i])){
                isValid=true;
            }
        }
    }
}

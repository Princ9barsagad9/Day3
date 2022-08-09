import java.math.BigDecimal;
import java.util.Scanner;

public class Bank {
    Scanner scanner= new Scanner(System.in);
    public boolean isValid=false;
    private BigDecimal balance=new BigDecimal("0");
    long accno[]={89342764389l,60147752128l,11231123123l};

    public void addBalance(){
        System.out.println("Please enter how much Amount you want to Deposite");
        BigDecimal bg1;
        bg1=scanner.nextBigDecimal();
        this.balance=(this.balance).add(bg1);
        System.out.println("Rs "+this.balance+" has been deposited in the account");
        checkBalance();
        process();
    }

    public void checkBalance() {
        System.out.println("the Current balance is: "+this.balance);
        process();
    }

    public void substractBalance() {
        System.out.println("Please enter how much Amount you want to WithDrawl");
        BigDecimal bg2;
        bg2=scanner.nextBigDecimal();
        this.balance=(this.balance).subtract(bg2);
        System.out.println("Rs "+this.balance+" has been withdrawl from account.");
        checkBalance();
        process();
    }

    public void process() {
        System.out.println(" Please chose from the options given below very carefully");
        System.out.println("1.checkbalance   2.Deposite balance  3.WithDraw Balance");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                checkBalance();
                break;
            case 2:
                addBalance();
                break;
            case 3:
                substractBalance();
                break;
            case 4:
                openAccount();
            default:
                System.out.println("invalid choice");
        }
    }

    private void openAccount() {


    }

    public boolean authentication() {
        isValid=false;
        System.out.print("Please enter Your Account number: ");
        long accno=scanner.nextLong();
        for(int i=0;i<(this.accno.length);i++){
            if(accno==(this.accno[i])){
                isValid=true;
            }
        }return isValid;
    }
}

public class BankRunner {
    public static void main(String[] args) {
        Bank customer =new Bank();
        System.out.println("-----------------Welcome to World's Best bank----------------");
        System.out.println("welcome sir/madam");
        customer.authentication();
        if(customer.isValid) {
            System.out.println("Your Account Number is Valid");
            customer.process();
        }else{
            System.out.println("Your entered account number is Invalid");
            customer.authentication();
        }
    }
}

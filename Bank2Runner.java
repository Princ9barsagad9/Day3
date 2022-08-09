public class Bank2Runner {
    public static void main(String[] args) {
        Bank2 b = new Bank2();
        System.out.println("************************ (Welcome to world's best Bank) **********************");
        System.out.println("Sir/Madam,please chose from the below options very carefully");
        b.ask();
        if(b.o1==1){
            b.openAccount();
        }else if(b.o1==2){
            b.loginAccount();
            if(b.isValid==true){
                System.out.println("Welcome sir You account number is Valid.");
            }else{
                System.out.println("Sorry your entered Account Number is inValid");
                b.ask();
            }
        }else{
            System.out.println("Invalid Entry");
        }
    }
}

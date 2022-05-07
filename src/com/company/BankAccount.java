package com.company;

    import java.util.Objects;
     import java.util.Scanner;

    class BankPrep {

        private static double accBalance;
        private final String accName;
        private final float accNo;

        BankPrep(String accName , float accNo){
            this.accName = accName;
            this.accNo = accNo;
        }

        void withdraw(double withdraw_amount){

            if(withdraw_amount <= accBalance){
                BankPrep.accBalance = BankPrep.accBalance -withdraw_amount ;
                System.out.println("Withdraw Sucessfull : Your current Balance is "+BankPrep.accBalance);
            }
            else {
                System.out.println("Withdraw unsuccessful");
            }

        }

        public  double getaccBalance() {
            return accBalance;
        }

        public String getAccName() {
            return accName;
        }

        public double getAccNo() {
            return accNo;
        }

        public  void setaccBalance(double accBalance) {
            BankPrep.accBalance = accBalance;
        }
    }

    public class BankAccount {

        public static void main(String[] args) {


            BankPrep acc1 = new BankPrep("Asya",103140);
            BankPrep acc2 = new BankPrep("Ibrahim",121859);

            Scanner input = new Scanner(System.in);


            System.out.println("Choose account 1 or 2 ?");
            String accountOwner = input.nextLine();


            if(Objects.equals(accountOwner, "1")){
                //Account 2

                System.out.println("Your Account 1  name is "+" "+acc1.getAccName());
                System.out.println("Your Account 1 balance "+"  "+acc1.getaccBalance());
                System.out.println("Your Account 1 number "+"  "+acc1.getAccNo());



                Scanner deposit = new Scanner(System.in);
                System.out.println("Enter Amount you want to deposit To account 1");
                double depositAMount = deposit.nextDouble();
                acc1.setaccBalance(depositAMount);
                System.out.println("Your Account 1 balance is now"+ "  "+acc1.getaccBalance());

                Scanner withdraw = new Scanner(System.in);
                System.out.println("Enter Amount you want to withdraw to Account 1");
                double withdrawAMountAcc1 = withdraw.nextDouble();
                acc1.withdraw(withdrawAMountAcc1);



            }

            else  if(Objects.equals(accountOwner, "2")){
                //Account 2

                System.out.println("Your Account 2 name is "+" "+acc2.getAccName());
                System.out.println("Your Account 2 balance "+"  "+acc2.getaccBalance());
                System.out.println("Your Account 2 number "+"  "+acc2.getAccNo());



                Scanner deposit2 = new Scanner(System.in);
                System.out.println("Enter Amount you want to deposit To account 2");
                double depositAMountAcc2 = deposit2.nextDouble();
                acc2.setaccBalance(depositAMountAcc2);
                System.out.println("Your Account 2 balance is"+ "  "+acc2.getaccBalance());




                Scanner withdraw2 = new Scanner(System.in);
                System.out.println("Enter Amount you want to withdraw to Account 2");
                double withdrawAMountAcc2 = withdraw2.nextDouble();
                acc2.withdraw(withdrawAMountAcc2);


            }

            else {
                System.out.println("Please, enter a valid Account number");

            }
        }

    }



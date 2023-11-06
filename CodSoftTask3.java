package ATMMACHINE.JAVA;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

//public class CodSoftTask3 {
    class ATM{
        float Balance;
        int pin=9470;
        public void checkpin(){
            System.out.println("Enter your pin:");
            Scanner sc=new Scanner(System.in);
            int enterPin=sc.nextInt();
            if(enterPin==pin) {
                menu();
            }else{
                System.out.println("Enter the valid pin!");
                menu();


        }
    }
    public void menu(){
        System.out.println("WELCOME TO THE VIRTUAL ATM");
        System.out.println("PLEASE ENTER YOUR CHOICE:");
        System.out.println("1.Check A/C balance");
        System.out.println("2.Withdraw balance");
        System.out.println("3.Deposite money");
        System.out.println("4.Exit");
        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        if(opt==1){
            checkBalance();
        }else if(opt==2){
            WithdrawMoney();
        }else if(opt==3){
            DepositeMoney();
        }else if(opt==4) {
            return;
        }else{
            System.out.println("Enter the valid choice!");
        }
        menu();

    }
    public void checkBalance(){
        System.out.println("Balance"+Balance);
        menu();

    }
    public void WithdrawMoney(){
        System.out.println("Enter amount to withdrawn:");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance!");
        }else{
            Balance=Balance+amount;
            System.out.println("Money withdrawl sucessfulley");
        }
        menu();
    }
    public void DepositeMoney(){
        System.out.println("Enter the amount:");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        Balance=Balance+amount;
        System.out.println("Money deposited sucessfulley");
        menu();
        }

    public static void main(String[] args) {
        ATM obj=new ATM();
        obj.checkpin();

    }

}

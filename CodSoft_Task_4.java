package currencyConverter;
import java.util.*;
import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.text.DecimalFormat;


public class CodSoft_Task_4 {
    public static class Currency_Converter {
        public static void main(String[] args) {



            double rupee, doller, pound, euro, code;
            DecimalFormat f = new DecimalFormat("##.###");
            Scanner sc = new Scanner(System.in);
            System.out.println("*** Welcome to currency converter *** \n Enter the currency to convert:\n 1.Rupee\n 2.doller\n 3.pound\n 4.euro");


            code = sc.nextInt();

                      if (code == 1) {
                System.out.println("Enter amount in rupee:");
                rupee = sc.nextDouble();
                doller = rupee / 83.28;
                System.out.println("Doller: " + f.format(doller));
                pound = rupee / 101.15;
                System.out.println("Pound: " + f.format(pound));
                euro = rupee / 88.07;
                System.out.println("Euro: " + f.format(euro));
            } else if (code == 2) {
                System.out.println("Enter the amount in doller");
                doller = sc.nextDouble();
                rupee = doller * 83.28;
                System.out.println("Rupee: " + f.format(rupee));
                pound = doller * 0.82;
                System.out.println("Pound: " + f.format(pound));
                euro = doller * 0.95;
                System.out.println("Euro: " + f.format(euro));
            } else if (code == 3) {

                System.out.println("Enter the amount in pound:");
                pound = sc.nextDouble();
                rupee = pound * 101.15;
                System.out.println("Rupee: " + f.format(rupee));
                doller = pound * 1.21;
                System.out.println("Doller: " + f.format(doller));
                euro = pound * 1.15;
                System.out.println("Euro: " + f.format(euro));
            } else if (code == 4) {
                System.out.println("Enter the amount in euro:");
                euro = sc.nextDouble();
                rupee = euro * 88.07;
                System.out.println("Rupee: " + f.format(rupee));
                doller = euro * 1.06;
                System.out.println("Doller: " + f.format(doller));
                pound = euro * 0.87;
                System.out.println("Euro: " + f.format(euro));
            } else {
                System.out.println("Invalid code");

            }
        }

    }
}

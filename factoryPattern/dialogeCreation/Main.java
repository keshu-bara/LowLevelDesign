package factoryPattern.dialogeCreation;

import factoryPattern.dialogeCreation.dialoge.*;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String os = sc.next();

        Dialoge d;
        if(os.equals("Win")){
            d = new WindowsDialoge();
        }
        else if(os.equals("Mac")){
            d = new MacDialoge();
        }
        else{
            System.out.println("Error os not identified!");
            sc.close();
            throw new IllegalArgumentException("Unsupported OS: " + os);
            

        }
        d.render();
        sc.close();
    }
}

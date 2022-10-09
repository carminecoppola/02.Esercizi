/*
public class TestPurse{

    public static void main(String[] args) {
    

        /*1)Metodo
        Purse test = new Purse();
        test.addNickels(5);
        test.addDimes(10);
        test.addQuarter(15);
        float totale = test.getTotal();
        System.out.println("Il risultato è: " + totale);
        */

/*
import javax.swing.JOptionPane; //Includiamo la libreria per effettuare il secondo metodo

public class TestPurse{

    public static void main(String[] args) {

        /* 2)Metodo
        Purse test = new Purse();
        String input = JOptionPane.showInputDialog("Quanti nickles vuoi inserire?");
        int count=Integer.parseInt(input);
        test.addNickels(count);

        String input_2 = JOptionPane.showInputDialog("Quanti dimes vuoi inserire?");
        int count_2=Integer.parseInt(input_2);
        test.addDimes(count_2);

        String input_3 = JOptionPane.showInputDialog("Quanti quarters vuoi inserire?");
        int count_3=Integer.parseInt(input_3);
        test.addQuarter(count_3);

        float totale = test.getTotal();
        System.out.println("Il risultato è: " + totale);    
    }
}*/

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestPurse{

    public static void main(String[] args) throws IOException{
        Purse test = new Purse();
        
        System.out.println("Quanti nickel vuoi?");
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader console = new BufferedReader(reader);
        String input = console.readLine();
        test.addNickels(Integer.parseInt(input));

        System.out.println("Quanti dimes vuoi?");
        BufferedReader console_2 = new BufferedReader(reader);
        String input_2 = console_2.readLine();
        test.addDimes(Integer.parseInt(input_2));

        System.out.println("Quanti quarters vuoi?");
        BufferedReader console_3 = new BufferedReader(reader);
        String input_3 = console_3.readLine();
        test.addQuarter(Integer.parseInt(input_3));

        float totale = test.getTotal();
        System.out.println("Il risultato è: " + totale); 
    }
}
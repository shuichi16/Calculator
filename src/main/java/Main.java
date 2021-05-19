import javax.swing.*;
import java.util.Scanner;

public class Main {

    //project calculator

        public static void main(String[] args){


            double num1, num2, sum, subtraction, multiplication, division;


            num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Write the fist number"));


            num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Write the second number"));

            sum = num1 + num2;
            subtraction = num1 - num2;
            multiplication = num1 * num2;
            division = num1 / num2;

            JOptionPane.showMessageDialog(null,
                      num1+ "+"+num2+ " = "+ sum+
                    "\n"+num1+"-"+num2+" = "+ subtraction+
                    "\n"+num1+"*"+num2+" = "+ multiplication+
                    "\n"+num1+"/"+num2+" = "+ division+"");

        }

}

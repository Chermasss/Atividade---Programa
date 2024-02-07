package soma;
import javax.swing.JOptionPane;

public class Soma{
    public static void main (String[] args ) 
    {
        
        
         String escolha = JOptionPane.showInputDialog( "Enter 1 Sum, 2 Multiplication, 3 Subtraction, 4 Division");
        
        if(escolha.equals("1")){
        
                String firstNumber = JOptionPane.showInputDialog( "Enter first integer");
                String secondNumber = JOptionPane.showInputDialog( "Enter second integer");

                int number1 = Integer.parseInt( firstNumber );
                int number2 = Integer.parseInt( secondNumber );



                int sum = number1 + number2;

                JOptionPane.showMessageDialog( null, "The Sum is " + sum, 
                            "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE );
        
    }else{
       
         if(escolha.equals("2")){
        
                String firstNumber = JOptionPane.showInputDialog( "Enter first integer");
                String secondNumber = JOptionPane.showInputDialog( "Enter second integer");

                int number1 = Integer.parseInt( firstNumber );
                int number2 = Integer.parseInt( secondNumber );



                int mul = number1 * number2;

                JOptionPane.showMessageDialog( null, "The Multiplication is " + mul, "Mul of Two Integers", JOptionPane.PLAIN_MESSAGE );
                
         }else{
             
              if(escolha.equals("3")){
        
                String firstNumber = JOptionPane.showInputDialog( "Enter first integer");
                String secondNumber = JOptionPane.showInputDialog( "Enter second integer");

                int number1 = Integer.parseInt( firstNumber );
                int number2 = Integer.parseInt( secondNumber );



                int div = number1 / number2;

                JOptionPane.showMessageDialog( null, "The Division is " + div, "Div of Two Integers", JOptionPane.PLAIN_MESSAGE );
                
                }else{
                  
                if(escolha.equals("4")){
        
                String firstNumber = JOptionPane.showInputDialog( "Enter first integer");
                String secondNumber = JOptionPane.showInputDialog( "Enter second integer");

                int number1 = Integer.parseInt( firstNumber );
                int number2 = Integer.parseInt( secondNumber );



                int sub = number1 - number2;

                JOptionPane.showMessageDialog( null, "The Subtraction is " + sub, "Sub of Two Integers", JOptionPane.PLAIN_MESSAGE );  
                }
              }
            }
        }
    }
}

import javax.swing.JOptionPane;

public class Additionjavawillis 
{   
    public static void main(String[] args) 
    {
        String firstNumber =
           JOptionPane.showInputDialog("enter first interger");
         String secondNumber =
           JOptionPane.showInputDialog("enter second interger");
         
        int number1 = Interger.parseInt( firstNumber );
        int number2 = Interger.parseInt( secondNumber );
        
        int sum = number1 + number2;
        
        JOptionPane.showmessageDialog(nu11."the sum is "+ sum,"sum of twu interger",JOptioPane.plain_message);
    }
    
}

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
 class TryCatchExampleDemo394 {
     public static void main(String[] args) {
         String input;
         int num;
         input = showInputDialog(null, "Enter the number:", "The number", QUESTION_MESSAGE);
         try {
             num = parseInt(input);
             showMessageDialog(null, "The number " + (num - 1) + ", " + num + " and " + (num + 1), "The number", INFORMATION_MESSAGE);
         } catch (Exception e) {
             showMessageDialog(null, "Something goes wrong way Ilya...", "Error", ERROR_MESSAGE);
         }
         }
     }
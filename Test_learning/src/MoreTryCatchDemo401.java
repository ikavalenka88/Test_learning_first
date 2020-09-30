import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
 class MoreTryCatchDemo401 {
     public static void main(String[] args) {
         String input;
         char[] symbs;
         int size,index;
         input=showInputDialog(null,"Specified size of array","Character array",QUESTION_MESSAGE);
         try {
             size=parseInt(input);
             symbs=new char[size];
             String txt="| ";
             for (int k=0;k<size;k++){
                 symbs[k]=(char)('A'+k);
                 txt+=symbs[k]+" | ";
             }
             showMessageDialog(null,txt,"The Character from array",INFORMATION_MESSAGE);
             input=showInputDialog(null,"Specified index of elements","The index of element a array",QUESTION_MESSAGE);
             index=parseInt(input);
             txt="The Index - "+index+"\n The Character - "+symbs[index];
             showMessageDialog(null,txt,"Character",INFORMATION_MESSAGE);
         }
         catch (NumberFormatException e){
             showMessageDialog(null,"Unfortenatelly,we have error...","Error",WARNING_MESSAGE);
         }
         catch (NegativeArraySizeException e){
             showMessageDialog(null,"Incorrect size of array!","The Error in progress of creating of array",ERROR_MESSAGE);
         }
         catch (ArrayIndexOutOfBoundsException e){
             showMessageDialog(null,"Are You sure? Specified elements is absent!","The Error in progress of selection of index",QUESTION_MESSAGE);
         }
     }
}

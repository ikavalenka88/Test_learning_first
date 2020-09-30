import java.util.*;
 class NestedTryCatchDemo406 {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         char[] symbs;
         int size,index;
         try{
             System.out.print("Select the size of array: ");
             size=input.nextInt();
             symbs=new char[size];
             System.out.print("| ");
             for (int k=0;k<size;k++){
                 symbs[k]=(char)('A'+k);
                 System.out.print(symbs[k]+" | ");
             }
             try{
                 System.out.print("\nSpecified the Index: ");
                 index=input.nextInt();
                 System.out.println("The Character - "+symbs[index]);
             }
             catch (ArrayIndexOutOfBoundsException e){
                 System.out.println("Specified element is absent");
             }
             finally {
                 System.out.println("The Array is created a successfully");
             }
             System.out.println("For index specified integer value");
         }
         catch (InputMismatchException e){
             System.out.println("Error: You are not specified value");
         }
         catch (NegativeArraySizeException e){
             System.out.println("Wrong size of array");
         }
         System.out.println("Execution of program is completed");
     }
}

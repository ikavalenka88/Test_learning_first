/*public class Array_learning {
    public static void main(String[] args) {
        String input, title = "Binominal koefficient";
        input = JOptionPane.showInputDialog(null,"Spevified value lower index",title,JOptionPane.QUESTION_MESSAGE);
        if (input ==null){
            System.exit(0);
        }
        int n;
        n = Integer.parseInt(input);
        if (n<0){
            JOptionPane.showMessageDialog(null,"Select wrong index",title,JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        int [] binoms = new int[n+1];
        binoms[0] = 1;
        String txt = "Containing array:\n| "+binoms[0]+"|";
        for (int m=1;m<binoms.length;m++){
            binoms[m]=binoms[m-1]*(n-m+1)/m;
            txt+=" "+binoms[m]+"|";
        }
        JOptionPane.showMessageDialog(null,txt,title,JOptionPane.INFORMATION_MESSAGE);
    }
}*/
/*
class UsingListDemo {
    public static void main(String[] args) {
        String[] txt = {"wolf","Fox","Bear","Racoon"};
        String[] files = {"thisisohhuenna.jpg", "2n9pt8.jpg", "IMG_20170317_022657.jpg", "stincky.jpg"};
        String folder = "/home/ikavalenka/Pictures/";
        String msg = "How  you want to see?";
        String title = "In this world";
        ImageIcon img = new ImageIcon(folder + "stincky.jpg");
        String animal;
        animal = (String)JOptionPane.showInputDialog(null, msg, title, JOptionPane.PLAIN_MESSAGE, img, txt, txt[0]);
        if (animal==null){
            System.exit(0);
        }
        for (int k =0;k<txt.length;k++){
            if (animal.equals(txt[k])){
                img=new ImageIcon(folder+files[k]);
                break;
            }
        }
        JOptionPane.showMessageDialog(null,img,animal,JOptionPane.PLAIN_MESSAGE);
    }
}*/
/*
class UsingForArrayDemo{
    public static void main(String[] args) {
        int size =10;
        Random rnd = new Random();
        int[] nums = new int[size];
        String txt = "Array of random numbers: \n";
        for (int k=0;k<nums.length;k++){
            nums[k]=rnd.nextInt(10)+1;
            txt+=nums[k]+" | ";
        }
        txt+="\n Verification: \n";
        for (int s:nums){
            txt+=s+" | ";
        }
        JOptionPane.showInputDialog(null,txt,"Random number",JOptionPane.PLAIN_MESSAGE);
    }
}
*/
/*
class AssigningArraysDemo{
    static void  show(int[] nums){
        for (int s:nums){
            System.out.print(" | "+s+" ");
        }
        System.out.println("|");
    }

    public static void main(String[] args) {
        int[] add={1,3,5,7,9};
        int[] even={2,4,8,10,12,14,16};
        System.out.println("Array add:");
        show(add);
        System.out.println("Array even:");
        show(even);
        System.out.println("Executing assigning.");
        even=add;
        even[0]=-1;
        System.out.println("Array add:");
        show(add);
        System.out.println("Array even:");
        show(even);
    }
}*/
/*
class MultiplicationTableDemo{
    public static void main(String[] args) {
        int rows = 9, cols = 9;
        int[][] table = new int[rows][cols];
        String txt = "\t|\t";
        for (int i=1;i<=cols;i++){
            txt+=i+"\t";
        }
        txt+="\n";
        for (int i=1;i<=10+8*cols;i++){
            txt+="-";
        }
        for (int i =0;i<table.length;i++){
            txt+="\n"+(i+1)+"\t|\t";
            for (int j=0;j<table[i].length;j++){
                table[i][j]=(i+1)*(j+1);
                txt+=table[i][j]+"\t";
            }
        }
        System.out.println("Table of multiplication:");
        System.out.println(txt);
    }
}*/
/*    class Show2ArrayDemo{
        static void show(int[][] nums){
            for (int i=0;i<nums.length;i++){
                for (int j=0;j<nums[i].length;j++){
                    System.out.print(nums[i][j]+" ");
                }
                System.out.println("");
            }
        }

    public static void main(String[] args) {
        int [][] alpha={{1,2,3},{4,5,6}};
        int [][] bravo={{1,2,3},{4,5},{6,7,8,9}};
        System.out.println("The array Aplpha:");
        show(alpha);
        System.out.println("The Array Bravo:");
        show(bravo);
        }
}*/
/*
class Using2DCharArrayDemo {
    public static void main(String[] args) {
        int[] size = {3, 12, 4, 7};
        char[][] symbs = new char[size.length][];
        char s = 'A';
        String txt ="";
        for (int i =0; i<symbs.length;i++){
            symbs[i] = new char[size[i]];
            for (int j =0; j<symbs[i].length;j++) {
                symbs[i][j] = s;
                s++;
                txt += " | " + symbs[i][j] + " ";
            }
                txt+="|\n";
        }
        JOptionPane.showMessageDialog(null,txt,"The Array with string of different length",JOptionPane.PLAIN_MESSAGE,new ImageIcon("/home/ikavalenka/Pictures/памагите.jpg"));
    }
}*/
 class  ArrayAndMethodsDemo{
     static void showqD(int [] nums){
         for (int s:nums){
             System.out.printf("%4d",s);
         }
         System.out.println("");
     }
     static void show2D(int [][] nums){
         for (int[]p:nums){
             for (int s:p){
                 System.out.printf("%4d",s);
             }
             System.out.println("");
         }
     }
     static  int[] prod(int[][]A,int[]B){
         int[] C =new int[A.length];
         for (int i =0;i<C.length;i++){
             C[i]=0;
            for (int j=0;j<B.length;j++){
                C[i]=A[i][j]*B[j];
            }
         }
         return C;
     }

    public static void main(String[] args) {
        int [][] A = {{1,0,3,-1},{2,-1,-2,3},{-1,1,0,2}};
        int[] B = {1,-1,3,2};
        int[] C = prod(A,B);
        System.out.println("Matrix A:");
        show2D(A);
        System.out.println("Vector B:");
        showqD(B);
        System.out.println("Vector C=AB");
        showqD(C);
    }
}
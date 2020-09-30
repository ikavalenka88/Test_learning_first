class UsingThrowDemo414 {
    public static void main(String[] args) {
        Exception me= new Exception("Generated error");
        try{
            System.out.println("Generation of error in progress");
            try {
                throw me;
            }
            catch (Exception one){
                System.out.println(one);
                System.out.println("And now we have one more error");
                throw one;
            }
        }
        catch (Exception two){
            System.out.println(two);
        }
        System.out.println("Execution of program is completed");
    }
}

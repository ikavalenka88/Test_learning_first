 class MyException423 extends Exception{
    private int code;
    MyException423(int n){
        super();
        code=n;
    }
    public String toString(){
        String txt="The Exception of class MyException\n";
        txt+="Code error: "+code+"\n";
        txt+="----------------------";
        return txt;
    }
}
class MyMistake424 extends RuntimeException{
    private int code;
    MyMistake424(int n){
        super();
        code=n;
    }
    public String toString(){
        String txt="The Exception of class MyMistake\n";
        txt+="The code of error: "+code+"\n";
        txt+="******************************";
        return txt;
    }
}
class UsingMyExceptionDemo{
    static void alpha(int n)throws MyException423{
        throw new MyException423(n);
    }
    static void bravo(int n){
        throw new MyMistake424(n);
    }

    public static void main(String[] args) {
        try{
            try{
                alpha(123);
            }
            catch (MyException423 e){
                System.out.println(e);
                bravo(321);
            }
        }
        catch (MyMistake424 e){
            System.out.println(e);
        }
    }
}
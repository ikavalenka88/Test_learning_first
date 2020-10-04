

public class MyThread430 implements Runnable {
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("Child thread: \t"+i);
            try{
                Thread.sleep(1200);
            } catch (InterruptedException e){
                System.out.println("Interruption children thread");
            }
        }

    }

}
class CreatingThreadDemo{
    public static void main(String[] args) {
        System.out.println("The begin of execution programm");
        Thread t =new Thread(new MyThread430());
        System.out.println("The launch of children thread");
        t.start();
        for (int k=0;k<=5;k++){
            System.out.println("The main thread:\t"+(char)+('A'+k));
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println("Interuption of first thread");
            }
        }
        System.out.println("The execution of program a completed");
    }
}

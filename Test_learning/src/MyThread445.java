import java.util.Random;

class MyThread445 extends Thread {
    private int count;
    MyThread445(String name,int count){
        super(name);
        this.count=count;
        start();
    }
    public void run(){
        System.out.println("The execution of thread "+getName());
        Random rnd=new Random();
        for (int k=1;k<=count;k++){
            System.out.println("The message from thread " +getName()+":\t"+getName().charAt(0)+k);
            try{
                Thread.sleep(1000+ rnd.nextInt(2001));
            }catch (InterruptedException e){
                System.out.println("Interruption of thread "+getName());
            }
        }
        System.out.println("Thread "+getName()+" completed");
    }
}
class  MultiThreadDemo{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("The begin of execution of main thread");
        MyThread445 A=new MyThread445("Alpha",5);
        MyThread445 B=new MyThread445("Bravo",3);
        MyThread445 C=new MyThread445("Charlie",7);
        for (int k=1;k<=4;k++){
            System.out.println("The message by the main thread:\t"+k);
            Thread.sleep(2000);
        }
        if (A.isAlive()){
            A.join();
        }
        if (B.isAlive()){
            B.join();
        }
        if (C.isAlive()){
            C.join();
        }
        System.out.println("The min thread is completed");
    }
}

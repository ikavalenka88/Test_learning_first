class MyThread439 extends Thread {
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("The Child thread:\t"+i);
            try{
                Thread.sleep(4500);
            }catch (InterruptedException e){
                System.out.println("The Interruption of child thread");
            }
        }
    }
}
class ExtendingThreadDemo440{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("The begin of execution of program");
        MyThread439 t =new MyThread439();
        System.out.println("The run of child thread");
        t.start();
        for (int k=0;k<=5;k++){
            System.out.println("The Main thread:\t"+(char)('A'+k));
            Thread.sleep(2000);
        }
        if (t.isAlive()){
            t.join();
        }
        System.out.println("The Execution of program is completed");
    }
}

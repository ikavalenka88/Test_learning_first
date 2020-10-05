public class    NewThreadDemo434 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("The beginning of execution program");
        Thread t =new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =1;i<=5;i++){
                    System.out.println("The child thread:\t"+i);
                    try{
                        Thread.sleep(4500);
                    }catch (InterruptedException e){
                        System.out.println("Interruption for child thread");
                    }
                }
            }
        });
        System.out.println("Run child thread");
        t.start();
        for (int k=0;k<=5;k++){
            System.out.println("The main thread:\t"+(char)('A'+k));
            Thread.sleep(2000);
        }
        if (t.isAlive()){
            t.join();
        }
        System.out.println("Execution of program is completed");
    }
}

 class MyNumber454 {
    int number;
}
class MyThread455 extends Thread{
    private MyNumber454 obj;
    private int time;
    private int count;
    private boolean state;
    MyThread455(String name,MyNumber454 obj,int time,int count,boolean state){
        super(name);
        this.obj=obj;
        this.time=time;
        this.count=count;
        this.state=state;
        start();
    }
    private void line(){
        char s;
        if (state) s='-';
        else s='*';
        for (int k=1;k<=35;k++){
            System.out.print(s);
        }
        System.out.println("");
    }
    public void run(){
        for (int k=1;k<=count;k++){
            synchronized (obj){
                line();
                System.out.println("Thread "+getName()+":initial value "+obj.number);
                try{
                    Thread.sleep(time);
                }catch (InterruptedException e){
                    System.out.println(e);
                }
                if (state) obj.number++;
                else obj.number--;
                System.out.println("Thread "+getName()+": new value "+obj.number);
                line();
            }
        }
    }
    static class SynchronizedThreadDemo457{
        public static void main(String[] args) {
            int n=100,count=5,time=1000,dt=200;
            MyNumber454 obj=new MyNumber454();
            obj.number=n;
            MyThread455 Alpha=new MyThread455("Alpha",obj,time+dt,count,true);
            MyThread455 Bravo=new MyThread455("Bravo",obj,time-dt,count,false);
            try {
                if (Alpha.isAlive()) Alpha.join();
                if (Bravo.isAlive()) Bravo.join();
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

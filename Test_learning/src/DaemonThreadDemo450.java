import static javax.swing.JOptionPane.*;

class DaemonThreadDemo450 {
     public static void main(String[] args) throws InterruptedException {
         Thread t=new Thread(()->{
             int k=1,s=0;
             while(true){
                 System.out.println(Thread.currentThread().getName()+": "+s);
                 try {
                     Thread.sleep(1000);
                 }catch (InterruptedException e){}
                 s+=k;
                 k++;
             }
         },"The Summary");
         t.setDaemon(true);
         int res;
         t.start();
         do {
             Thread.sleep(3000);
             res=showConfirmDialog(null,"Finish calculation of the summ?","The summ of numbers",YES_NO_OPTION);
         }while (res!=YES_OPTION);
     }
}

 class MainThreadDemo441 {
     public static void main(String[] args) {
         Thread t;
         t=Thread.currentThread();
         System.out.println(t);
         t.setName("The Main thread");
         t.setPriority(7);
         System.out.println(t);
     }
}

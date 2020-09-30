public interface SecondB extends FirstA {
        void bravo();
        default void charlie(){
            System.out.println("The interface SecondB: method charlie()");
        }
        void echo();
    }
    class MyClassB implements SecondB{
        @Override
        public void bravo() {
            System.out.println("The class MyClassB: method bravo()");
        }

        @Override
        public void delta() {
            System.out.println("The class MyClassB: method delta()");
    }

        @Override
        public void echo() {
            System.out.println("The class MyClassB: method echo()");
        }
    }
    class ExtendingInterfaceDemo{
        public static void main(String[] args) {
            MyClassB obj=new MyClassB();
            obj.alpha();
            obj.bravo();
            obj.charlie();
            obj.delta();
            obj.echo();
        }
    }

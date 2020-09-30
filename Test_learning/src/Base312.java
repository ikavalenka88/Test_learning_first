interface Base312 {
    default void show(){
        System.out.println("The  interface Base: ");
    }
    void hello();
}
class MoreAnonymousClassDemo {
    public static void main(String[] args) {
        Base312 obj = new Base312(){
            @Override
            public void hello() {
                    System.out.println("The object of anonymous class");
                }
            };
            obj.show();
            obj.hello();
            new Base312(){
                public void hello(){
                    System.out.println("The Anonymous object");
                }
                void showAll(){
                    hello();
                    show();
                }
            }.showAll();
        }
    }

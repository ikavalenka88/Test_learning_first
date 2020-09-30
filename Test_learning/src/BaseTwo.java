public interface BaseTwo {
    default void show(String txt){
        System.out.println("The inteface Base: " +txt);
    }
    void hello();
}

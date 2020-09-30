public interface FirstA {
    default void alpha(){
        System.out.println("The interface FirstA: method alpha()");
    }
    default void bravo(){
        System.out.println("The interface FirstA: method bravo()");
    }
    default void charlie(){
        System.out.println("The interface FirstA: method charlie()");
    }
    void delta();
}

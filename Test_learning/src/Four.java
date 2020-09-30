public interface Four extends Third {
    default void alphaThird(){
        Third.super.alphaThird();
        System.out.println("The interface Bravo: method alphaThird()");
    }
    default void bravo(){
        System.out.println("The interface Bravo: method bravo()");
    }
}

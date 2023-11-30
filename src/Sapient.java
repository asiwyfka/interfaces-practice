public interface Sapient extends Living {

    void couldCreate();

    default void move(){
        System.out.println("Я передвигаюсь на двух ногах.");
    }

    default void haveBraine() {
        System.out.println("У меня есть не только мозг, но и разум.");
    }
}

public interface Wild extends Animal{

    default void move(){
        System.out.println("Я передвигаюсь на четырех лапах.");
    }

}

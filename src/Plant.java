public interface Plant extends Living {

    void rootDiscription();

    @Override
    default void nutritionDescription() {
        System.out.println("Я питаюсь корнями");
    }

    default void haveFotosintesis() {
        System.out.println("Я могу производить кислород.");
    }

}

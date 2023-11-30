public interface Animal extends Living {

    void giveVoice();

    void move();

    default void haveBraine() {
        System.out.println("У меня есть мозг.");
    }
}

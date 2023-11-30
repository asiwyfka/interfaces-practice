public interface Living {

    void reproductionDescription();

    void nutritionDescription();

    default void mortalityDescription() {
        System.out.println("Я просто могу умереть и вообще без разницы как... Я буду тлен");
    }

}

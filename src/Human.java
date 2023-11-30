public class Human implements Sapient{

    public void showAllMethods(Human human) {
        human.nutritionDescription();
        human.reproductionDescription();
        human.mortalityDescription();
        human.haveBraine();
        human.giveVoice();
        human.couldCreate();
        human.move();
        System.out.println();
    }


    public void giveVoice() {
        System.out.println("Человек издает голос речью языка: \"Привет, дружище!\"");
    }

    @Override
    public void reproductionDescription() {
        System.out.println("Человек размножается половым способом.");
    }

    @Override
    public void nutritionDescription() {
        System.out.println("Человек питается с помощью рта.");
    }

    @Override
    public void couldCreate() {
        System.out.println("Человек создал различные виды искусств, корабль, на котором слетал до луны");
    }

    @Override
    public String toString() {
        return "Human";
    }
}

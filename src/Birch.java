public class Birch implements Tree {

    public void showAllMethods(Birch birch) {
        birch.nutritionDescription();
        birch.reproductionDescription();
        birch.mortalityDescription();
        birch.haveFotosintesis();
        birch.crownDiscription();
        birch.rootDiscription();
        System.out.println();
    }


    @Override
    public void reproductionDescription() {
        System.out.println("Береза размножается семенами сережек.");
    }

    @Override
    public void rootDiscription() {
        System.out.println("У березы корневая система среднего размера, если говорить про деревья.");
    }

    @Override
    public void crownDiscription() {
        System.out.println("У березы крона среднего размера, если говорить про деревья.");
    }
}

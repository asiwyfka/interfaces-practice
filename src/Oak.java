public class Oak implements Tree {

    public void showAllMethods(Oak oak) {
        oak.nutritionDescription();
        oak.reproductionDescription();
        oak.mortalityDescription();
        oak.haveFotosintesis();
        oak.crownDiscription();
        oak.rootDiscription();
        System.out.println();
    }


    @Override
    public void reproductionDescription() {
        System.out.println("Дуб разможается желудями.");
    }
    @Override
    public void rootDiscription() {
        System.out.println("У дуба корневая система большого размера, если говорить про деревья.");
    }
    @Override
    public void crownDiscription() {
        System.out.println("У дуба крона большого размера, если говорить про деревья.");
    }
}

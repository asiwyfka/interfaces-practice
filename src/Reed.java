public class Reed implements Herb {

    public void showAllMethods(Reed reed) {
        reed.nutritionDescription();
        reed.reproductionDescription();
        reed.mortalityDescription();
        reed.haveFotosintesis();
        reed.rootDiscription();
        reed.makeHerbalFloor();
        System.out.println();
    }

    @Override
    public void makeHerbalFloor() {
        System.out.println("Сделали из травы пол.");
    }

    @Override
    public void reproductionDescription() {
        System.out.println("Тростник разможается черенками.");
    }

    @Override
    public void rootDiscription() {
        System.out.println("У тростника маленькая корневая система.");
    }
}

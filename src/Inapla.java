public class Inapla implements Sapient, Plant {

    public void showAllMethods(Inapla inapla) {
        inapla.nutritionDescription();
        inapla.reproductionDescription();
        inapla.mortalityDescription();
        inapla.haveBraine();
        inapla.haveFotosintesis();
        inapla.rootDiscription();
        inapla.giveVoice();
        inapla.couldCreate();
        inapla.move();
        System.out.println();
    }

    @Override
    public void rootDiscription() {
        System.out.println("Инапла имеет ультрасенсорные корни, которыми читает мысли на расстоянии в один километр.");
    }


    public void giveVoice() {
        System.out.println("Инапла не издает звуки. Оно молчит.");
    }

    @Override
    public void reproductionDescription() {
        System.out.println("Инапла размножается мыслью.");
    }

    @Override
    public void nutritionDescription() {
        System.out.println("Инапла питается мыслями.");
    }

    @Override
    public void couldCreate() {
        System.out.println("Инапла создало четырхмерное пространство для Human и Dog.");
    }



/*   Я не могу так просто перегружать метод в классе? Нужно обязательно такой вид перегруженного метода указать в интерфейсе?
     @Override
     public void couldCreate(Object object1,Object object2) {
     System.out.println("Инапла создало четырхмерное пространство." +object1.toString() + object2.toString());
     }
*/


}

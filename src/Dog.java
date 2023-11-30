public class Dog implements Wild {


    //ToDo:Я метод showAllMethods не могу использовать как статик, потому что в него входят нестатичные методы?
    //ToDo:Да и смысл от него теряется так как во внутренних методах этого метода мы обращаемся через конкретный объект?
    public void showAllMethods(Dog dog) {
        dog.nutritionDescription();
        dog.reproductionDescription();
        dog.mortalityDescription();
        dog.haveBraine();
        dog.giveVoice();
        dog.move();
        System.out.println();
    }

    @Override
    public void giveVoice() {
        System.out.println("Собака дает голос: \"Гав-гав!\"");
    }

    @Override
    public void reproductionDescription() {
        System.out.println("Собака размножается половым способом.");
    }

    @Override
    public void nutritionDescription() {
        System.out.println("Собака питается с помощью пасти.");
    }

}

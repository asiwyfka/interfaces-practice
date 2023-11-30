public class Main {
    public static void main(String[] args) {

        /*
            i:                           living
            si1:            sapient    | animal |           plant
            si2:              --       |  wild  |    tree     | boosh
            classes:    human | inapla |  dog   | oak | birch | raspberry
        */

        Birch birch = new Birch();
        Dog dog = new Dog();
        Human human = new Human();
        Inapla inapla = new Inapla();
        Oak oak = new Oak();
        Reed reed = new Reed();

        //ToDo:такая запись вызова всех методов объекта грамотна или нет?
        birch.showAllMethods(birch);
        dog.showAllMethods(dog);
        human.showAllMethods(human);
        inapla.showAllMethods(inapla);
        oak.showAllMethods(oak);
        reed.showAllMethods(reed);
        //ToDo:посмотреть в классе Dog!

    }
}
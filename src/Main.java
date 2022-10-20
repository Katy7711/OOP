public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Максим", 35, "Минск", "бренд-менеджер");
        Person person2 = new Person("Аня", 29, "Москва", "методист образовательных программ");
        Person person3 = new Person("Катя", 28, "Калининград", "продакт-менеджер");
        Person person4 = new Person("Артем", 27, "Москва", "директор по развитию бизнеса");


        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);


        Flower rose = new Flower("Роза обыкновенная", "Голландия", 35.59, 0);
        Flower chrysanthemum = new Flower("Хризантема", "        ", 15, 5);
        Flower peony = new Flower("Пион", "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", "Турция", 19.5, 10);

        System.out.println(rose);
        System.out.println(chrysanthemum);
        System.out.println(peony);
        System.out.println(gypsophila);


        calculateCostBouquet(rose, 6, chrysanthemum, 7, peony, 3, gypsophila, 7, 10);



    }

    public static void calculateCostBouquet(Flower rose, int amountRosa, Flower chrysanthemum, int amountChrysanthemum,
                                            Flower peony, int amountPeony, Flower gypsophila, int amountGypsophila, int percentToTheFlorist) {
        double costBouquet = (rose.getCost() * amountRosa + chrysanthemum.getCost() * amountChrysanthemum + peony.getCost() * amountPeony +
                gypsophila.getCost() * amountGypsophila) + (rose.getCost() * amountRosa + chrysanthemum.getCost() * amountChrysanthemum + peony.getCost() * amountPeony +
                gypsophila.getCost() * amountGypsophila) / 100 * percentToTheFlorist;

        System.out.println("Стимсть букета: " + costBouquet);
    }


}



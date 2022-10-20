public class Bouquet {


    private final Flower[] flowers;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }


    public int getLifeSpan() {
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower != null && flower.getLifeSpan() < minLifeSpan) {
                minLifeSpan = flower.lifeSpan;
            }

        }
        return minLifeSpan;
    }

}



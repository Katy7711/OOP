public class Flower {

    private final String flower;
    private String country;
    private double cost;
    int lifeSpan;


    public Flower(String flower, String country, double cost, int lifeSpan) {
        this.flower = flower;
        this.country = country;
        this.cost = cost;
        this.lifeSpan = lifeSpan;
    }


    public String getCountry() {
        if (country == null || country.isEmpty() || country.isBlank()) {
            country = "Россия";
        }
        return country;
    }

    public double getCost() {
        if (cost <= 0) {
            cost = 1;
        }
        return cost;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public int getLifeSpan() {
        if (lifeSpan <= 0) {
            lifeSpan = 3;
        }
        return lifeSpan;
    }

    public String getFlower() {
            return flower;
    }


    @Override
    public String toString() {
        return "Flower{" +
                "flowerColor='" + getFlower() + '\'' +
                ", country='" + getCountry() + '\'' +
                ", cost=" + getCost() +
                ", lifeSpan=" + getLifeSpan() +
                '}';
    }

}

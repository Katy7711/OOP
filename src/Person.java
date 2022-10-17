public class Person {

    String name;
    int age;
    String city;
    String job;


    public Person (String name, int age, String city, String job) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.job = job;
    }

    @Override
    public String toString() {
        return ("Привет! Меня зовут " + name + ". Я из города " + city + ". Мне " + age + " лет. Я работаю на должности " + job + ". Будем знакомы!");
    }
}

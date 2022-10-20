import java.time.LocalDate;

public class Person {

    String name;
    private final int age;
    private String city;
    String job;
    private final int yearOfBirth;


    Person(String name, int age, String city, String job) {
        this.name = name;
        this.age = Math.max(age, 0);
        this.city = city;
        this.job = job;
        this.yearOfBirth = LocalDate.now().getYear() - getAge();

        }



    public String getName() {
         if (name == null) {
             name = "Информация не указана";
         }
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        if (city == null) {
            city = "Информация не указана";
        }
        return city;
    }

    public String getJob() {
        if (job == null) {
            job = "Информация не указана";
        }
        return job;
    }


    @Override
    public String toString() {
        return ("Привет! Меня зовут " + getName() + ". Я из города " + getCity() + ". Я родился в " + getYearOfBirth() + " году. Я работаю на должности " + getJob() + ". Будем знакомы!");
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
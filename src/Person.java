public class Person {

    String name;
    int age;
    String city;
    String job;



     Person(String name, int age, String city, String job) {
        this.name = name;
        this.age = Math.max(age, 0);
        this.city = city;
        this.job = job;

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
        return ("Привет! Меня зовут " + getName() + ". Я из города " + getCity() + ". Мне " + getAge() + " лет. Я работаю на должности " + getJob() + ". Будем знакомы!");
    }

}
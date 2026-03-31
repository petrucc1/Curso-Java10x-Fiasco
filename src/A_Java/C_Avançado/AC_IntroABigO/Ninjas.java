package A_Java.C_Avançado.AC_IntroABigO;

public class Ninjas {
    String name;
    int age;

    public Ninjas(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

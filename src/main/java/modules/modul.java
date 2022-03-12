package modules;

public class modul {
    private String name;
    private int age;

    public modul(String name) {
        this.name = name;
    }

    public modul(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

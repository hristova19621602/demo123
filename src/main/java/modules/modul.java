package modules;

import java.util.Objects;

public class modul<String> {
    private String name;
    private int age;
    private int iii;

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

    public int getIii() {
        return iii;
    }

    public void setIii(int iii) {
        this.iii = iii;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof modul)) return false;
        modul modul = (modul) o;
        return getAge() == modul.getAge() && getIii() == modul.getIii() && Objects.equals(getName(), modul.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getIii());
    }
}

package Polyclinic;

public abstract class Animal {
    private String name;
    private int age;
    private String type;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String makeNoise();
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

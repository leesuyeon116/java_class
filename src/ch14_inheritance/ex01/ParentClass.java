package ch14_inheritance.ex01;

public class ParentClass {
    public String name;
    private int age;

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
    public ParentClass() {
        System.out.println("부모 기본생성자");
    }

    public void hello() {
        System.out.println("ParentClass.hello");
    }
    @Override
    public String toString() {
        return "ParentClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

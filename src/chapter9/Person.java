package chapter9;

public class Person  {
    private String name;
    private int age;
    private boolean gender;
    public Person(){
        System.out.println("The default constructor in superClass");
    }
    public Person(String name){
        System.out.println("The second constructor in superClass");
    }

    public String getName() {
        return name;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }


}

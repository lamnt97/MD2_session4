public class Person {
    // thuộc tính
    private String name;
    private boolean sex;
    private int age;

    //conntructor ko tham số

    public Person() {
    }

    //constructor đầy đủ tham số

    public Person(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public boolean isSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

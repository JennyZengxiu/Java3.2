package practice10;

public class Person {
    private int age;
    private String name;
    private int id;

    public Person(int id, String name, int age) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public int getId() {
        return id;
    }

    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old.";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        else {
            if(obj instanceof  Person){
                Person person = (Person) obj;
                if (person.id == this.id && person.age == this.age && person.name == this.name) {
                    return true;
                }
            }
        }
        return false;
    }
}
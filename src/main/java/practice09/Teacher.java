package practice09;

public class Teacher extends Person{
    private int age;
    private String name;
    Klass klass = null;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id,name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (klass == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            return super.introduce() + " I am a Teacher. I teach Class " + klass.getNumber() + ".";
        }
    }

    public String introduceWith(Student jerry) {
        if (klass.getNumber() == jerry.klass.getNumber()) {
            return super.introduce()+" I am a Teacher. I teach Jerry.";
        } else {
            return super.introduce() + " I am a Teacher. I don't teach Jerry.";
        }
    }
}
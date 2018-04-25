package practice10;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Teacher extends Person{
    private int id;
    private int age;
    private String name;
    Klass klass = null;
    HashSet<Klass> classes = new HashSet<Klass>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, HashSet<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        String strResult = new String();
        strResult = super.introduce();
        if (classes.isEmpty()) {
            strResult += " I am a Teacher. I teach No Class.";
        }
        else {
            strResult += " I am a Teacher. I teach Class";
            classes.stream().sorted();
            for(Klass k:classes){
                strResult += " "+k.getNumber()+",";
            }
            strResult = strResult.substring(0,strResult.length()-1);
            strResult += ".";
        }
        return strResult;
    }

    public String introduceWith(Student jerry) {
        if (isTeaching(jerry)) {
            return super.introduce()+" I am a Teacher. I teach Jerry.";
        } else {
            return super.introduce() + " I am a Teacher. I don't teach Jerry.";
        }
    }

    public HashSet<Klass> getClasses() {
        return classes;
    }

    public boolean isTeaching(Student jerry) {
        return classes.contains(jerry.getKlass()) ? true : false;
    }
}
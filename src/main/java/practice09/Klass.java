package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private  int num;
    private Student leader = null;
    List <Student> classMember = new ArrayList<Student>();

    public Klass(int num){
        this.num = num;
    }

    public int getNumber() {
        return num;
    }

    public String getDisplayName() {
        return "Class " + num;
    }

    public void assignLeader(Student jerry) {
        if (classMember.contains(jerry)){
            leader = jerry;
        }
        else{
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student jerry) {
        classMember.add(jerry);
    }
}
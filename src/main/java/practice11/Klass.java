package practice11;

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
            System.out.print("I am Tom. I know "+jerry.getName()+" become Leader of Class "+num+".\n");
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
        System.out.print("I am Tom. I know "+jerry.getName()+" has joined Class "+num+".\n");
    }
}
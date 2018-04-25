package practice08;

public class Klass {
    private  int num;
    private Student leader = null;
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
        leader = jerry;
    }

    public Student getLeader() {
        return leader;
    }
}
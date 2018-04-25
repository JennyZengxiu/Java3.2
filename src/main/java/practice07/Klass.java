package practice07;

public class Klass {
    private  int num;
    public Klass(int num){
        this.num = num;
    }
    public int getNumber() {
        return num;
    }

    public String getDisplayName() {
        return "Class " + num;
    }
}

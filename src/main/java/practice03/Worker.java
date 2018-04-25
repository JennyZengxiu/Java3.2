package practice03;

public class Worker extends Person{
    private int age;
    private String name;
    public Worker(String name, int age) {
        super(name,age);
    }
    public String introduce() {
        return "I am a Worker. I have a job.";
    }
}

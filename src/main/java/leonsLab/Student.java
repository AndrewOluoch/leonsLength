package leonsLab;

public class Student extends Person implements Learner {

    private double totalStudyTime;

    public Student(){
        super(0L,null);
        totalStudyTime =0.0;
    }

    public Student (long id, String name) {
        super(id, name);
        totalStudyTime =0.0;
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime = totalStudyTime+numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}

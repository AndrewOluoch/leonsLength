package leonsLab;

public interface Learner {
//    public static final int constant = 9;
    public abstract void learn(double numberOfHours);
    Double getTotalStudyTime();


    /*
    To implement an interface, the implementing class
    is required to provide an implementation of the
    interface's abstract methods. ONLY the abstract methods.
     */
}
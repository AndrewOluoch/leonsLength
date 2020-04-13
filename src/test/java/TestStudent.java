import leonsLab.Learner;
import leonsLab.Person;
import leonsLab.Student;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestStudent {
    public void testImplementation() {
        Student student = new Student(3748L, "Andrew");
        assert student instanceof Learner;
    }
    public void testInheritance(){
        Student student1 = new Student(3748L,"Andrew");
        assert student1 instanceof Person;
    }
    @Test
    public void testLearn(){
        Student student = new Student(3748L,"Andrew");
        //figure out what the total study time was prior
        double totStudyTimePrior = student.getTotalStudyTime();
        //specify value by which to increment
        double val  = 9.3;
        //increment
        student.learn(val);
        //verify
        double totStudyTime = student.getTotalStudyTime();
        assertTrue(totStudyTime == totStudyTimePrior + val);
    }
}

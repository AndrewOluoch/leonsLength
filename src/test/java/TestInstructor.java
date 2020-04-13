import leonsLab.*;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(3748L,"Drew");
        assert instructor instanceof Teacher;
    }
    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(3748L,"Drew");
        assert instructor instanceof Person;
    }
    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(3748L, "Drew");
        Learner learner = new Student();
        double expected = 16.0;
        learner.learn(8.0);
        instructor.teach(learner, 8.0);
        double actual = learner.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void testLecture(){
        Instructor instructor = new Instructor(3748L, "Drew");
        Student[] students ={new Student(), new Student(), new Student()};
        instructor.lecture(students,6.0);
        double expected =2.0;
        double actual = students[0].getTotalStudyTime();
        Assert.assertEquals(expected,actual,0.0);

    }
}

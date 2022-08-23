import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CohortTest {
    Cohort venus;
    @Before
    public void init() {
        venus = new Cohort();
        Student Cody = new Student(1, "Cody");
        venus.addStudent(Cody);
        Cody.addGrade(85);
        Cody.addGrade(90);
        Student DocRob = new Student(2, "DocRob");
        venus.addStudent(DocRob);
        DocRob.addGrade(88);
        DocRob.addGrade(97);
    }
    @Test
    public void testStudentAdd() {
        assertEquals(2, venus.getStudents().size());
    }

    @Test
    public void testGetCurrentList() {
        assertNotNull(venus.getStudents());
    }

    @Test
    public void testGetAverage() {
        assertEquals(90.0,venus.getCohortAverage(),2);
    }
}

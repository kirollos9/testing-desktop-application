package phaseone;

import static org.junit.Assert.*;

import org.junit.Test;

public class tests1 {

	@Test
	public void test_full_mark() {
		subject sub= new subject();
		sub.full_mark=100;
		boolean s;
		s=sub.check_subject_full_mark(100);
		assertEquals("fail in ",s,true);
	}
	@Test
	public void test_subj_name() {
		subject sub= new subject();
		boolean s=sub.check_subject_name("math");
		assertEquals("fails in subject name",true,s);
	}
	@Test
	public void test_subj_code() {
		subject sub= new subject();
		boolean s=sub.check_subject_code("csc123");
		assertEquals("fails in subject code",true,s);
	}
	@Test
	public void test_student_name() {
		student st =new student();
		boolean s= st.check_Student_name("kirollos gerges sobhy abdelmalek");
		assertEquals("fails in student name",true,s);
	}
	@Test
	public void test_student_number(){
		student st =new student();
		boolean s= st.check_student_number("1234564f");
		assertEquals("fails in student number",true,s);
	}
	@Test
	public void test_student_activities(){
		student st =new student();
		boolean s= st.check_student_activities_mark(10);
		assertEquals("fails in student activities mark",true,s);
	}
	@Test
	public void test_student_oral(){
		student st =new student();
		boolean s= st.check_student_oral_practical_mark(10);
		assertEquals("fails in student oral_practical_mark",true,s);
	}
	@Test
	public void test_student_mid(){
		student st =new student();
		boolean s= st.check_student_mid_mark(20);
		assertEquals("fails in student mid mark",true,s);
	}
	@Test
	public void test_student_final(){
		student st =new student();
		boolean s= st.check_student_final_mark(50);
		assertEquals("fails in student final mark",true,s);	
	}
	@Test
	public void test_student_gpa(){
		student st =new student();
		st.student_activities_mark=0;
		st.student_oral_practical_mark=0;
		st.student_mid_mark=0;
		st.student_final_mark=0;
		boolean s= st.gpa_calculate();
		assertEquals("fails in student gpa calculate",true,s);
		assertEquals("fails in calculating the gpa string",st.gpa,"F");
	}
	
}

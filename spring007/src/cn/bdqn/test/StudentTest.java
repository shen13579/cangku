package cn.bdqn.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bdqn.dao.Student;
import cn.bdqnservice.StudentService;

public class StudentTest {
	 @Test
	    // ����
	    public void addTest() {
	        ApplicationContext context = new ClassPathXmlApplicationContext(
	                "applicationContext.xml");
	        StudentService service = (StudentService) context.getBean("service");
	        service.addStudent(new Student(5655, "С��5"));
	    }

	    @Test
	    // ɾ��
	    public void delTest() {
	        ApplicationContext context = new ClassPathXmlApplicationContext(
	                "applicationContext.xml");
	        StudentService service = (StudentService) context.getBean("service");
	        Student student = new Student();
	        student.setSid(2);
	        service.delStudent(student);
	    }

	    @Test
	    // �޸�
	    public void updateTest() {
	        ApplicationContext context = new ClassPathXmlApplicationContext(
	                "applicationContext.xml");
	        StudentService service = (StudentService) context.getBean("service");
	        Student student = new Student();
	        student.setSid(1);
	        student.setSname("xiao");
	        student.setAge(1000);
	        service.updateStudent(student);
	    }

	    @Test
	    // ��ѯѧ������
	    public void findNames() {
	        ApplicationContext context = new ClassPathXmlApplicationContext(
	                "applicationContext.xml");
	        StudentService service = (StudentService) context.getBean("service");
	        List<String> names = service.findNames();
	        for (String string : names) {
	            System.out.println(string);
	        }
	    }

	    @Test
	    // ��ѯѧ��
	    public void findStudents() {
	        ApplicationContext context = new ClassPathXmlApplicationContext(
	                "applicationContext.xml");
	        StudentService service = (StudentService) context.getBean("service");
	        List<Student> list = service.findStudents();
	        for (Student student : list) {
	            System.out.println(student);
	        }
	    }
	    
}

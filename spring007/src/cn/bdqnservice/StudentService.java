package cn.bdqnservice;

import java.util.List;

import cn.bdqn.dao.Student;

public interface StudentService {
	 //新增学生
    void addStudent(Student student);
    //删除学生
    void delStudent(Student student);
    //修改学生
    void updateStudent(Student student);
    
    //查询所有
    List<Student> findStudents();
    //查询所有的学生姓名
    List<String> findNames();
}

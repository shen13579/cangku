package cn.bdqn.dao;

import java.util.List;

public interface StudentDao {
	 //新增学生
    int addStudent(Student student);
    //删除学生
    int delStudent(Student student);
    //修改学生
    int updateStudent(Student student);
    
    //查询所有
    List<Student> findStudents();
    //查询所有的学生姓名
    List<String> findNames();
}

package cn.bdqn.service.impl;

import java.util.List;

import cn.bdqn.dao.Student;
import cn.bdqn.dao.StudentDao;
import cn.bdqnservice.StudentService;

public class StudentServiceImpl implements StudentService {

	  private StudentDao dao;

	    // 新增
	    @Override
	    public void addStudent(Student student) {
	        int num = dao.addStudent(student);
	        if (num > 0) {
	            System.out.println("新增成功");
	        } else {
	            System.out.println("新增失败");
	        }
	    }

	    @Override
	    // 删除
	    public void delStudent(Student student) {
	        int num = dao.delStudent(student);
	        if (num > 0) {
	            System.out.println("删除成功");
	        } else {
	            System.out.println("删除失败");
	        }
	    }

	    @Override
	    // 修改
	    public void updateStudent(Student student) {
	        int num = dao.updateStudent(student);
	        if (num > 0) {
	            System.out.println("修改成功");
	        } else {
	            System.out.println("修改失败");
	        }
	    }

	    @Override
	    // 查询所有的学生信息
	    public List<Student> findStudents() {
	        return dao.findStudents();
	    }

	    @Override
	    // 查询所有的学生姓名
	    public List<String> findNames() {
	        return dao.findNames();
	    }

	    public StudentDao getDao() {
	        return dao;
	    }

	        //DI 依赖注入
	    public void setDao(StudentDao dao) {
	        this.dao = dao;
	    }


}

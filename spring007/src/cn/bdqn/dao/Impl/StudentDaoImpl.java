package cn.bdqn.dao.Impl;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import cn.bdqn.dao.Student;
import cn.bdqn.dao.StudentDao;

public class StudentDaoImpl extends JdbcDaoSupport  implements StudentDao {

	   @Override//新增
	    public int addStudent(Student student) {
	        String sql="insert into  student(age,name) values(?,?)";
	        return getJdbcTemplate().update(sql,student.getAge(),student.getSname());
	    }
	    @Override//删除
	    public int delStudent(Student student) {
	        String sql="delete  from  student where id=?";
	        return getJdbcTemplate().update(sql,student.getSid());
	    }

	    @Override//修改
	    public int updateStudent(Student student) {
	        String sql="update   student   set age=?,name=? where id=?";
	        return getJdbcTemplate().update(sql,student.getAge(),student.getSname(),student.getSid());
	    }
	    
	    //查询所有的学生信息
	    @Override
	    public List<Student> findStudents() {
	        String sql="select * from student";
	        //需要配置  行 映射器    因为 表中有3列  spring期望值是一列  
	        return getJdbcTemplate().query(sql, new StudentRowMapper());
	    }
	    //查询所有的姓名
	    @Override
	    public List<String> findNames() {
	        String sql="select name from student";
	        return getJdbcTemplate().queryForList(sql, String.class);
	    }

}

package cn.bdqn.dao.Impl;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import cn.bdqn.dao.Student;
import cn.bdqn.dao.StudentDao;

public class StudentDaoImpl extends JdbcDaoSupport  implements StudentDao {

	   @Override//����
	    public int addStudent(Student student) {
	        String sql="insert into  student(age,name) values(?,?)";
	        return getJdbcTemplate().update(sql,student.getAge(),student.getSname());
	    }
	    @Override//ɾ��
	    public int delStudent(Student student) {
	        String sql="delete  from  student where id=?";
	        return getJdbcTemplate().update(sql,student.getSid());
	    }

	    @Override//�޸�
	    public int updateStudent(Student student) {
	        String sql="update   student   set age=?,name=? where id=?";
	        return getJdbcTemplate().update(sql,student.getAge(),student.getSname(),student.getSid());
	    }
	    
	    //��ѯ���е�ѧ����Ϣ
	    @Override
	    public List<Student> findStudents() {
	        String sql="select * from student";
	        //��Ҫ����  �� ӳ����    ��Ϊ ������3��  spring����ֵ��һ��  
	        return getJdbcTemplate().query(sql, new StudentRowMapper());
	    }
	    //��ѯ���е�����
	    @Override
	    public List<String> findNames() {
	        String sql="select name from student";
	        return getJdbcTemplate().queryForList(sql, String.class);
	    }

}

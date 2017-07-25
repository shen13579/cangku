package cn.bdqn.dao.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cn.bdqn.dao.Student;

public class StudentRowMapper implements RowMapper<Student>{
	//这里的ResultSet指的是单行数据  并不是 所有行的结果集
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
    Student student=new Student();
    student.setSid(rs.getInt("id"));
    student.setAge(rs.getInt("age"));
    student.setSname(rs.getString("name"));
        return student;
    }
}

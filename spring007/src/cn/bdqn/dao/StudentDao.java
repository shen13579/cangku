package cn.bdqn.dao;

import java.util.List;

public interface StudentDao {
	 //����ѧ��
    int addStudent(Student student);
    //ɾ��ѧ��
    int delStudent(Student student);
    //�޸�ѧ��
    int updateStudent(Student student);
    
    //��ѯ����
    List<Student> findStudents();
    //��ѯ���е�ѧ������
    List<String> findNames();
}

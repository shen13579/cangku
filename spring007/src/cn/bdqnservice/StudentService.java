package cn.bdqnservice;

import java.util.List;

import cn.bdqn.dao.Student;

public interface StudentService {
	 //����ѧ��
    void addStudent(Student student);
    //ɾ��ѧ��
    void delStudent(Student student);
    //�޸�ѧ��
    void updateStudent(Student student);
    
    //��ѯ����
    List<Student> findStudents();
    //��ѯ���е�ѧ������
    List<String> findNames();
}

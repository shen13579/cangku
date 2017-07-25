package cn.bdqn.service.impl;

import java.util.List;

import cn.bdqn.dao.Student;
import cn.bdqn.dao.StudentDao;
import cn.bdqnservice.StudentService;

public class StudentServiceImpl implements StudentService {

	  private StudentDao dao;

	    // ����
	    @Override
	    public void addStudent(Student student) {
	        int num = dao.addStudent(student);
	        if (num > 0) {
	            System.out.println("�����ɹ�");
	        } else {
	            System.out.println("����ʧ��");
	        }
	    }

	    @Override
	    // ɾ��
	    public void delStudent(Student student) {
	        int num = dao.delStudent(student);
	        if (num > 0) {
	            System.out.println("ɾ���ɹ�");
	        } else {
	            System.out.println("ɾ��ʧ��");
	        }
	    }

	    @Override
	    // �޸�
	    public void updateStudent(Student student) {
	        int num = dao.updateStudent(student);
	        if (num > 0) {
	            System.out.println("�޸ĳɹ�");
	        } else {
	            System.out.println("�޸�ʧ��");
	        }
	    }

	    @Override
	    // ��ѯ���е�ѧ����Ϣ
	    public List<Student> findStudents() {
	        return dao.findStudents();
	    }

	    @Override
	    // ��ѯ���е�ѧ������
	    public List<String> findNames() {
	        return dao.findNames();
	    }

	    public StudentDao getDao() {
	        return dao;
	    }

	        //DI ����ע��
	    public void setDao(StudentDao dao) {
	        this.dao = dao;
	    }


}

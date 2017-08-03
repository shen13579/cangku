package cn.bdqn.dao;

import java.util.List;

import cn.bdqn.bean.News_comment;

public interface BaseDao<T> {
	/**
	 * ����
	 *t ���û����ݹ�������������
	 */
	void add(T t);
	/**
	 * �޸�
	 * @param t
	 */
	void update(T t);
	/**
	 * ɾ��
	 * @param t
	 */
	void  del(T t);
	/**
	 * ������������
	 */
	List<T> findList(String hql);
	List<News_comment> findComments(Integer id);
}

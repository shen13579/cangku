package cn.bdqn.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import cn.bdqn.bean.News_comment;
import cn.bdqn.dao.BaseDao;

public class BaseDaoImpl<T>  implements BaseDao<T> {
	/**
	 * ����session����
	 */
	private SessionFactory sessionFactory;
	/**
	 * ��sessionfactory�л�ȡsession�Ự
	 */
	private Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void add(T t) {
		getCurrentSession().save(t);
	}

	@Override
	public void update(T t) {
		getCurrentSession().update(t);
	}

	@Override
	public void del(T t) {
		getCurrentSession().delete(t);
	}
	/**
	 * ��ȡ���з���һsql���
	 */
	@Override
	public List<T> findList(String hql) {
		return getCurrentSession().createQuery(hql).list();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<News_comment> findComments(Integer id) {
		
		return getCurrentSession().createCriteria(News_comment.class).add(Restrictions.eq("newsid", id)).list();
	}
	
}

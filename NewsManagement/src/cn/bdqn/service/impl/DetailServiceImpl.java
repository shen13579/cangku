package cn.bdqn.service.impl;

import java.util.List;

import cn.bdqn.bean.News_comment;
import cn.bdqn.bean.News_detail;
import cn.bdqn.dao.BaseDao;
import cn.bdqn.service.Detailservice;

public class DetailServiceImpl implements Detailservice {
	private BaseDao<News_detail> dao;
	
	@Override
	public void add(News_detail t) {
		dao.add(t);
	}

	@Override
	public void update(News_detail t) {
		dao.update(t);
	}

	@Override
	public void del(News_detail t) {
		dao.del(t);
	}

	@Override
	public List<News_detail> findList(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	public BaseDao<News_detail> getDao() {
		return dao;
	}

	public void setDao(BaseDao<News_detail> dao) {
		this.dao = dao;
	}

	@Override
	public List<News_detail> findList() {
		return dao.findList("from News_detail");
	}

	

	@Override
	public List<News_comment> findComments(Integer id) {
		return dao.findComments(id);
	}

	
	
	
	
}

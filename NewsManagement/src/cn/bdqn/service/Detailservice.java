package cn.bdqn.service;

import java.util.List;

import cn.bdqn.bean.News_comment;
import cn.bdqn.bean.News_detail;
import cn.bdqn.dao.BaseDao;

public interface Detailservice extends BaseDao<News_detail> {
	List<News_detail> findList();
	
	
}

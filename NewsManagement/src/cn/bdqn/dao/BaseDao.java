package cn.bdqn.dao;

import java.util.List;

import cn.bdqn.bean.News_comment;

public interface BaseDao<T> {
	/**
	 * 新增
	 *t 是用户传递过来的真正对象
	 */
	void add(T t);
	/**
	 * 修改
	 * @param t
	 */
	void update(T t);
	/**
	 * 删除
	 * @param t
	 */
	void  del(T t);
	/**
	 * 返回所有内容
	 */
	List<T> findList(String hql);
	List<News_comment> findComments(Integer id);
}

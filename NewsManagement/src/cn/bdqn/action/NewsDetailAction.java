package cn.bdqn.action;

import java.util.List;

import cn.bdqn.bean.News_comment;
import cn.bdqn.bean.News_detail;
import cn.bdqn.service.Detailservice;

import com.opensymphony.xwork2.ActionSupport;

public class NewsDetailAction extends ActionSupport{
		/**
		 * µ÷ÓÃ detailservice²ã
		 */
	private Detailservice service;

	private List<News_detail> detaillist;
	private List<News_comment> comments;
	private Integer id;
	public String newsList(){
		detaillist=service.findList();
		return SUCCESS;
	}
	
	public String findComments(){
		comments=service.findComments(id);
		System.out.println("");
		
		return SUCCESS;
	}
		public Detailservice getService() {
			return service;
		}

		public void setService(Detailservice service) {
			this.service = service;
		}

		public List<News_detail> getDetaillist() {
			return detaillist;
		}

		public void setDetaillist(List<News_detail> detaillist) {
			this.detaillist = detaillist;
		}

		public List<News_comment> getComments() {
			return comments;
		}

		public void setComments(List<News_comment> comments) {
			this.comments = comments;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}
		
	
}

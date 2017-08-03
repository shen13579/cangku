package cn.bdqn.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class News_detail {
	private Integer id;//新闻编号
	private String title;//新闻名称
	private String summary;//新闻摘要
	private String author;//作者
	private Date createdate;//创建时间
	//级联
	private Set<News_comment> comments=new HashSet<News_comment>();
	
	public News_detail(Integer id, String title, String summary, String author,
			Date createdate, Set<News_comment> comments) {
		super();
		this.id = id;
		this.title = title;
		this.summary = summary;
		this.author = author;
		this.createdate = createdate;
		this.comments = comments;
	}
	
	public News_detail() {
		super();
	}

	public News_detail(Integer id, String title, String summary, String author,
			Date createdate) {
		super();
		this.id = id;
		this.title = title;
		this.summary = summary;
		this.author = author;
		this.createdate = createdate;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public Set<News_comment> getComments() {
		return comments;
	}
	public void setComments(Set<News_comment> comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "News_Detail [id=" + id + ", title=" + title + ", summary="
				+ summary + ", author=" + author + ", createdate=" + createdate
				+ ", comments=" + comments + "]";
	}
	
	 
}

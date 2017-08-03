package cn.bdqn.bean;

import java.util.Date;

public class News_comment {
	private Integer id;//编号
	private Integer newsid;//新闻编号
	private String content;//评论内容
	private String author;//评论人
	private  Date createdate;
	public News_comment(Integer id, Integer newsid, String content,
			String author, Date createdate) {
		super();
		this.id = id;
		this.newsid = newsid;
		this.content = content;
		this.author = author;
		this.createdate = createdate;
	}
	public News_comment() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNewsid() {
		return newsid;
	}
	public void setNewsid(Integer newsid) {
		this.newsid = newsid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	@Override
	public String toString() {
		return "News_Comment [id=" + id + ", newsid=" + newsid + ", content="
				+ content + ", author=" + author + ", createdate=" + createdate
				+ "]";
	}
	
	
}

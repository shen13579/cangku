package cn.bdqn.text;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bdqn.bean.News_detail;
import cn.bdqn.service.Detailservice;

public class NewsTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Detailservice sDetailservice=(Detailservice) context.getBean("detailservice");
			/*
			 * 新增：==sDetailservice.add(new News_detail(2, "王华峰找到工作", "化名王石", "华子", new Date()));*/
			List<News_detail> findList = sDetailservice.findList();
			for (News_detail news_detail : findList) {
				System.out.println(news_detail);
			}
	}

}

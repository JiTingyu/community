package com.nowcoder.community;

import com.nowcoder.community.dao.AlphaDao;
import com.nowcoder.community.service.AlphaService;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
class CommunityApplicationTests implements ApplicationContextAware {
	private ApplicationContext applicationContext;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {  //获取到spring容器
		//参数applicationContext其实就是spring容器
		this.applicationContext = applicationContext;
	}

	@Test
	void testApplicationContext() {
		AlphaDao alphaDao = applicationContext.getBean(AlphaDao.class);  //通过类型获取到Bean
		System.out.println(alphaDao.select());  //输出Mybatis，因为设了优先级高

		alphaDao = applicationContext.getBean("alphaHibernate",AlphaDao.class);  //通过名字获取到Bean
		System.out.println(alphaDao.select());  //输出Hiberate，因为设了Bean的名字
	}

	@Test
	void TestBeanManagement(){
		AlphaService alphaService = applicationContext.getBean(AlphaService.class);
		System.out.println(alphaService);

		//可以看出Bean是单例的，只会初始化一次
		alphaService = applicationContext.getBean(AlphaService.class);
		System.out.println(alphaService);
	}

	@Test
	public void testBeanConfig(){
		SimpleDateFormat simpleDateFormat = applicationContext.getBean(SimpleDateFormat.class);
		System.out.println(simpleDateFormat.format(new Date()));
	}

	//@Autowired自动注入，@Qualifier("名字") 按照名字自动注入
	@Autowired
	@Qualifier("alphaHibernate")
	private AlphaDao alphaDao;
	@Autowired
	private AlphaService alphaService;
	@Autowired
	private SimpleDateFormat simpleDateFormat;
	@Test
	public void testDI(){
		System.out.println(alphaDao);
		System.out.println(alphaService);
		System.out.println(simpleDateFormat);
	}

}

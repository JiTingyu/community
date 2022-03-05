package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author jitingyu
 * @CLASS_NAME: AlphaService
 * @date 2022/3/4 10:57 上午
 */
@Service
//@Scope("prototype")
public class AlphaService {
    @Autowired
    private AlphaDao alphaDao;
    public String find(){
        return alphaDao.select();
    }

    public AlphaService(){
//        System.out.println("实例化AlphaService");
    }

    @PostConstruct
    //注释@PostConstruct表示这个方法会在构造器之后调用
    public void init(){
//        System.out.println("初始化AlphaService");
    }

    @PreDestroy
    //注释@PreDestroy表示这个方法会在销毁之前调用
    public void destroy(){
//        System.out.println("销毁AlphaService");
    }
}

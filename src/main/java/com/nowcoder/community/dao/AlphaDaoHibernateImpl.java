package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @author jitingyu
 * @CLASS_NAME: AlphaDaoHibernateImpl
 * @date 2022/3/4 10:45 上午
 */
@Repository("alphaHibernate")
//访问数据库的用@Repository注解，如果加括号则参数为这个Bean的名字
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hiberbate";
    }
}

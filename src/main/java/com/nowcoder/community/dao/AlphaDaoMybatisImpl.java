package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @author jitingyu
 * @CLASS_NAME: AlphaDaoMybatisimpl
 * @date 2022/3/4 10:48 上午
 */
@Repository
@Primary
//注解@Primary会优先注入这个Bean
public class AlphaDaoMybatisImpl implements AlphaDao{

    @Override
    public String select() {
        return "Mybatis";
    }
}

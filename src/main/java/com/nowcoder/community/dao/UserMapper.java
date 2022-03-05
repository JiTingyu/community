package com.nowcoder.community.dao;


import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author jitingyu
 * @CLASS_NAME: UserMapper
 * @date 2022/3/4 5:04 下午
 */
@Mapper
//也可用@repository，但mybatis中提供了用@Mapper
public interface UserMapper {
    User selectById(int id);    //根据id查询
    User selectByName(String username);    //根据username查询
    User selectByEmail(String email);    //根据email查询
    int insertUser(User user);    //插入新用户
    int updateStatus(int id,int status);    //根据id更新状态status
    int updateHeader(int id,String headerUrl);    //根据id更新头像headerUrl
    int updatePassword(int id,String password);   //根据id更新密码password
}

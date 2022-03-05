package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author jitingyu
 * @CLASS_NAME: DiscussPostMapper
 * @date 2022/3/5 3:23 下午
 */
@Mapper
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);  //查询讨论帖，offset是每一页的起始行号，limit是每一页最多有多少数据
    //如果userId传入0，就相当于没有userId这个条件，如果userId传入不是0，就相当于有userId这个条件

    //@Param用于给参数取别名，如果只有一个参数并且在<if>中使用，则必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);  //查询帖子的行数
}

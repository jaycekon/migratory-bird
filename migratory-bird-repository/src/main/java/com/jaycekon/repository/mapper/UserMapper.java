package com.jaycekon.repository.mapper;

import com.jaycekon.repository.MyMapper;
import com.jaycekon.repository.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 2018/1/9 16:58
 */
@Mapper
public interface UserMapper extends MyMapper<User> {

    @Select("select * from user where username=#{username}")
    User selectByName(String username);

    User selectByIdCard(String idCard);
}

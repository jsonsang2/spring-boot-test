package com.wassup.springboottest.mapper;

import com.wassup.springboottest.model.dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    void saveUser(User pearlUser);

    int updateUser(User pearlUser);

    User findUserByName(String name);
}

package com.wjf.mapper;

import com.wjf.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface UserMapper {
    public User getObjectById(Integer id);
    public int insert(User user);
    public User login(User user);

}

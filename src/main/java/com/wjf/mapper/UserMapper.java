package com.wjf.mapper;

import com.wjf.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


@Mapper
public interface UserMapper {
    public User getObjectById(Integer id);
}

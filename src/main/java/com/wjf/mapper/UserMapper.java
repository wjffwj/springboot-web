package com.wjf.mapper;

import com.wjf.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public User getObjectById(Integer id);
}

package com.wjf.mapper;

import com.wjf.domain.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DepartmentMapper {
     Department selectById(Integer id);
}

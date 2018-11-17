package com.wjf.mapper;

import com.wjf.domain.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface EmployeeMapper {
    Employee selectById(Integer id);
}

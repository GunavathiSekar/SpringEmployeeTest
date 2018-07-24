package com.memorynotfound.dao;

import com.memorynotfound.model.EmployeeVO;
import java.util.List;

public interface EmployeeDAO {
    public List<EmployeeVO> getAllEmployees();
    public EmployeeVO getEmployee(Integer id);
}
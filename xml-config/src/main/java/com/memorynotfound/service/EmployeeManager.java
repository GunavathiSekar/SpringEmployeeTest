package com.memorynotfound.service;

import com.memorynotfound.model.EmployeeVO;
import java.util.List;
 

 
public interface EmployeeManager
{
    public List<EmployeeVO> getAllEmployees();
    public EmployeeVO getEmployee(Integer id);
}
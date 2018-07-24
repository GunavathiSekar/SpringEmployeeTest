package com.memorynotfound.service;

import com.memorynotfound.dao.EmployeeDAO;
import com.memorynotfound.model.EmployeeVO;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
 
@Service
public class EmployeeManagerImpl implements EmployeeManager {
 
    @Autowired
    EmployeeDAO dao;
     
    public List<EmployeeVO> getAllEmployees()
    {
        return dao.getAllEmployees();
    }

    public EmployeeVO getEmployee(Integer id)
    {
        return dao.getEmployee(id);
    }
}
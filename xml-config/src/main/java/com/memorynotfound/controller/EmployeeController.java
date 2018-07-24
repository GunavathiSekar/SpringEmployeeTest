package com.memorynotfound.controller;

import com.memorynotfound.model.EmployeeVO;
import com.memorynotfound.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
 

 
@Controller
@RequestMapping("/employees")
public class EmployeeController
{
    @Autowired
    EmployeeManager manager;
 
    // @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    // public String getAllEmployees(Model model)
    // {
    //     model.addAttribute("employees", manager.getAllEmployees());
    //     return "employeesListDisplay";
    // }
    @RequestMapping (method =  RequestMethod.GET)
    public String getAllEmployees(Model model)
    {
        model.addAttribute("employees", manager.getAllEmployees());
        return "employeesListDisplay";
    }

    @RequestMapping (method =  RequestMethod.GET)
    public String getOneEmployee(@RequestParam("id") Integer id,Model model)
    
    {
        model.addAttribute("employee", manager.getEmployee(id));
        return "employeesListDisplay";
    }
     
    @RequestMapping (method =  RequestMethod.POST)
    public String addEmployee(EmployeeVO employee)
    {
        //application code
        return "employeesDetail";
    }
     
    @RequestMapping (method =  RequestMethod.PUT)
    public String updateEmployee(EmployeeVO employee)
    {
        //application code
        return "employeesDetail";
    }
     
    @RequestMapping (method =  RequestMethod.DELETE)
    public String removeEmployee(@RequestParam("id") String employeeId)
    {
        //application code
        return "employeesList";
    }
}
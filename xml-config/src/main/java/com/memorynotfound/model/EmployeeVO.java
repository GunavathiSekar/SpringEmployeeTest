package com.memorynotfound.model;

import java.io.Serializable;
 
public class EmployeeVO implements Serializable
{
    private static final long serialVersionUID = 1L;
 
    private Integer id;
    private String firstName;
    private String lastName;
 
 /**
  * @return the id
  */
 public Integer getId() {
     return id;
 }
 /**
  * @param id the id to set
  */
 public void setId(Integer id) {
     this.id = id;
 }
 /**
  * @return the firstName
  */
 public String getFirstName() {
     return firstName;
 }
 /**
  * @param firstName the firstName to set
  */
 public void setFirstName(String firstName) {
     this.firstName = firstName;
 }
 /**
  * @return the lastName
  */
 public String getLastName() {
     return lastName;
 }
 /**
  * @param lastName the lastName to set
  */
 public void setLastName(String lastName) {
     this.lastName = lastName;
 }
    //Setters and Getters
 
    @Override
    public String toString() {
        return "EmployeeVO [id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + "]";
    }
}
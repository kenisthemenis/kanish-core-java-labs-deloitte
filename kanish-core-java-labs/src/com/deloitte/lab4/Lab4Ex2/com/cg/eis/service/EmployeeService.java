
package com.deloitte.lab4.Lab4Ex2.com.cg.eis.service;

import com.deloitte.lab4.Lab4Ex2.com.cg.eis.bean.Employee;

public interface EmployeeService {
    void getEmployeeDetails(Employee employee);

    void findInsuranceScheme(Employee employee);

    void displayEmployeeDetails(Employee employee);
}
package net.roseindia.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.roseindia.dao.Employee;

public class EmployeeService {

	static int i = 4;
	static Map<String,Employee> map = new HashMap<String, Employee>();
	static{
		Employee e = new Employee("1","Prasad","prasad@up.com");
		map.put(e.getId(), e);
		e = new Employee("2","Naveen","naveen@up.com");
		map.put(e.getId(), e);
		e = new Employee("3","Praddep","pradeep@up.com");
		map.put(e.getId(), e);
		e = new Employee("4","Arun","arun@up.com");
		map.put(e.getId(), e);
	}
	
	public Employee add(Employee e){
		e.setId(String.valueOf(++i));
		map.put(e.getId(), e);
		return e;
	}
	
	public Employee get(String id){
		return map.get(id);
	}
	
	public void update(Employee e){
		if(e!=null)
		map.put(e.getId(), e);
	}
	
	public Employee delete(Employee e){
		return map.remove(e);
	}
	
	public List<Employee> getAll(){
		return new ArrayList<Employee>(map.values());
	}
}

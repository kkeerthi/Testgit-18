/**
 * 
 */
package net.roseindia.web;

import net.roseindia.dao.Employee;
import net.roseindia.service.EmployeeService;

/**
 * @author xprk316
 *
 */
public class EmployeeController extends MultiActionController {

	private EmployeeService employeeService;
	
		public ModelAndView add(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
	 		return new ModelAndView("add", "employee",new Employee());
	 
		}
		public ModelAndView save(HttpServletRequest request,
				HttpServletResponse response,Employee employee) throws Exception {
				employeeService.add(employee);
				return list(request,response);
		 
			}
	 
		public ModelAndView delete(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
	 
			return new ModelAndView("CustomerPage", "msg","delete() method");
	 
		}
	 
		public ModelAndView update(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			String id= request.getParameter("id");
			Employee e=employeeService.get(id);
			return new ModelAndView("update", "employee",e);
	 
		}
	 
		public ModelAndView list(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			System.out.println("list action");
			return new ModelAndView("list","employees", employeeService.getAll());
		}

		/**
		 * @return the employeeService
		 */
		public EmployeeService getEmployeeService() {
			return employeeService;
		}

		/**
		 * @param employeeService the employeeService to set
		 */
		public void setEmployeeService(EmployeeService employeeService) {
			this.employeeService = employeeService;
		}
}

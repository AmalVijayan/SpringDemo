package mainn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Employee;


public class SpringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Resource r = new ClassPathResource("EmpBean.xml");
		//BeanFactory bf = new XmlBeanFactory(r);
		ApplicationContext c = new ClassPathXmlApplicationContext("EmpBean.xml");
		
		Employee e1 = (Employee)c.getBean("emp1");
		
		Employee e2 = c.getBean("emp2", Employee.class);
		
		
		System.out.println("Employee 1 : "+e1.getEname());
		System.out.println("Employee 2 : "+e2.getEname());
		
		ClassPathXmlApplicationContext cx = (ClassPathXmlApplicationContext)c;
		cx.close();
		
	}

}

package bean;

public class Employee {

     int Eid;
	 String Ename;
	 int sal;
	 String Desg;
	 
	 public Employee() {
		 }
	 
	 public Employee(int eid, String ename, int sal, String desg) {
			super();
			Eid = eid;
			Ename = ename;
			this.sal = sal;
			Desg = desg;
		}
	 


public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getDesg() {
		return Desg;
	}

	public void setDesg(String desg) {
		Desg = desg;
	}

 
 
}

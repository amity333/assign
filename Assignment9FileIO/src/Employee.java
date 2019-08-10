import java.io.*;

public class Employee implements Serializable {

	private int empId;
	private String empName;
	private float eSal;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float geteSal() {
		return eSal;
	}
	public void seteSal(float eSal) {
		this.eSal = eSal;
	}
	public Employee(int empId, String empName, float eSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.eSal = eSal;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", eSal=" + eSal + "]";
	}
	
	
}

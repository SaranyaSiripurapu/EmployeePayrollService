package payrollservice;

public class EmployeePayrollData {
	public EmployeePayrollData(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int id;
	public String name;
	public double salary;

	@Override
	public String toString() {
		return "EmployeePayrollData [id = " + id + ", name = " + name + ", salary = " + salary + "]";
	}
}

package com.poc;

public class Employee {
	private String name;
	private String companyName;
	public String getName() {
		return name;
	}
	public Employee(){
		
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(String name, String companyName) {
		super();
		this.name = name;
		this.companyName = companyName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void print(){
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public int hashCode(){
		
		int result = 1;
		for (int i = 0; i < name.length(); i++) {
			result = result + name.charAt(i);
		}
		System.out.println("hashCode Call for	:"+name+" "+result);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals call");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		
		return true;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", companyName=" + companyName + "]";
	}
}

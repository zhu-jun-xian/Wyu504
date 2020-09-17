import java.util.Date;

//创建Emp类
//定义私有属性: 
//String name，int age，String gender ，int salary， Date hiredate;//入职时间
// 	定义构造方法，以及属性get,set方法.
// 	定义toString方法，格式如:
//     	姓名:张三,年龄:25,性别:男,薪资:5000,入职时间:2020-01-11
// 	定义equals方法，要求名字，年龄，性别，薪资都相同，则认为内容一致。
// 	实现序列化接口，并定义版本号
public class Emp {
	private String name;
	private int age;
	private String gender;
	private int salary;
	private Date hiredate;
	Emp(){
		
	}
	public static final long serialVersionUID = 1L;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj) return true;
		if(this == null) return true;
		if(obj instanceof Emp)
		{
			Emp emp = (Emp) obj;
			if(emp.name.equals(name)&&emp.age == age&&emp.gender.equals(gender)&&emp.salary == salary) {
				return true;
			}else {
				return false;
			}
			
		}
		return super.equals(obj);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "姓名:"+name+",年龄:"+age+",性别:"+gender+",薪资:"+salary+",入职时间: "+hiredate;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
}

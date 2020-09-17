import java.util.Date;

//����Emp��
//����˽������: 
//String name��int age��String gender ��int salary�� Date hiredate;//��ְʱ��
// 	���幹�췽�����Լ�����get,set����.
// 	����toString��������ʽ��:
//     	����:����,����:25,�Ա�:��,н��:5000,��ְʱ��:2020-01-11
// 	����equals������Ҫ�����֣����䣬�Ա�н�ʶ���ͬ������Ϊ����һ�¡�
// 	ʵ�����л��ӿڣ�������汾��
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
		return "����:"+name+",����:"+age+",�Ա�:"+gender+",н��:"+salary+",��ְʱ��: "+hiredate;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
}

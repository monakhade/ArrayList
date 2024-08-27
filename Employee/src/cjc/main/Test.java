package cjc.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import cjc.main.model.Employee;

public class Test 
{
	public static void main(String[] args) 
	{
		ArrayList<Employee>emplist=new ArrayList<Employee>();
		emplist.add(new Employee(111, "Ram", 909919100,35000.00, "Hr", 31));
		emplist.add(new Employee(112, "Rahul",801234567,45000.00, "Manager", 55));
		emplist.add(new Employee(113, "Riya", 912221111,25000.01, "Hr", 32));
		emplist.add(new Employee(114, "Jyoti",  778899110, 26000.91,"Operation", 21));
		emplist.add(new Employee(115, "Suman",  777111888,29000.91, "TL", 35));
		emplist.add(new Employee(116, "Arti", 909919100,55000.00, "Hr", 31));
		emplist.add(new Employee(117, "Sonu",801234567,56000.00, "Manager", 55));
		emplist.add(new Employee(118, "Niya", 912221111,66000.01, "Hr", 33));
		emplist.add(new Employee(119, "Mishtee",  778899110, 26000.91,"Operation", 23));
		emplist.add(new Employee(101, "Lavi",  777111888,29000.91, "TL", 37));
		
		
		//find all Department
		System.out.println("***Find all Department***");
		//emplist.stream().map(n->n.getDepartment()).forEach(System.out::println);
		Set<String>dep=emplist.stream().map(Employee::getDepartment).collect(Collectors.toSet());
		System.out.println(dep);
		 
		//find all Department
		 System.out.println("***find all Employee and Department count***");
		 Map<String,Long>countdep=emplist.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		 System.out.println(countdep);
		 
		 //sort employee with name wise asc order
		 System.out.println("***sort employee with name wise asc order***");
		 List<Employee>sortlistname=emplist.stream().sorted(Comparator.comparing(Employee::getEname)).collect(Collectors.toList());
		 sortlistname.forEach(e->System.out.println(e.getEname()));
		 
		 //sort employee age des order
		 System.out.println("***sort employee age des order***");
		 List<Employee> age=emplist.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).collect(Collectors.toList());
		 age.forEach(e->System.out.println(e.getAge()));
	
		//sort employee by salary asc and des
		 System.out.println("***sort employee Salary Des order***");
		List<Employee>salaryDes=emplist.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
		salaryDes.stream().forEach(e-> System.out.println(e.getSalary()));
		
		System.out.println("***sort employee Salary Asc order***");
		List<Employee>salaryAsc=emplist.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
		salaryAsc.stream().forEach(e-> System.out.println(e.getSalary()));
		
		//find max/mini salary
		System.out.println("***Employee Maxmimum Salary***");
		Optional<Employee> maxsalary=emplist.stream().max(Comparator.comparingDouble(Employee::getSalary));
		System.out.println(maxsalary.get().getSalary());
		
		System.out.println("***Employee Minimum Salary***");
		Optional<Employee> minisalary=emplist.stream().min(Comparator.comparingDouble(Employee::getSalary));
		System.out.println(minisalary.get().getSalary());
	
		//find sum of all salary
		System.out.println("***Sum of all Salary***");
		double totalsum=emplist.stream().mapToDouble(Employee::getSalary).sum();
		System.out.println(totalsum);
		
		//find avg of salary
		System.out.println("***Avg Salary***");
		double totalavg=emplist.stream().mapToDouble(Employee::getSalary).average().orElse(0);
		System.out.println(totalavg);
		
		//find Total Employee count
		System.out.println("***Total Employee count***");
		long totalemp=emplist.stream().count();
		System.out.println(totalemp);
		
		//find Top 2nd highest salary
		System.out.println("***Top 2nd highest salary***");
		List<Employee>salarysechi=emplist.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).
					limit(1).collect(Collectors.toList());
		salarysechi.stream().forEach(e-> System.out.println(e.getSalary()));
				
		//find Top 3 highest salary
		System.out.println("***Top 3 highest salary***");
		List<Employee>salarysec=emplist.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).
				limit(3).collect(Collectors.toList());
		salarysec.stream().forEach(e-> System.out.println(e.getSalary()));
		

		
		}
}

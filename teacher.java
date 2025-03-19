import java.util.Scanner;
class employee1
{
int empid;
String name;
double salary;
String address;
employee1(int no,String na,double sal,String add)
{
this.empid=no;
this.name=na;
this.salary=sal;
this.address=add;
}
}
class teacher extends employee1
{
String dept;
String subject;
teacher(int no,String na,double sal,String add,String dep,String sub)
{
super(no,na,sal,add);
this.dept=dep;
this.subject=sub;
}
void display()
{
System.out.println("employee id:"+empid);
System.out.println("employee name:"+name);
System.out.println("employee salary:"+salary);
System.out.println("employee address:"+address);
System.out.println("department:"+dept);
System.out.println("subject:"+subject);
}
public static void main(String[] args)
{
Scanner sc1=new Scanner(System.in);

System.out.println("enter the no of employees:");
int num=sc1.nextInt();
teacher[] arr=new teacher[num];
for(int i=0;i<num;i++)
{
Scanner sc=new Scanner(System.in);
System.out.println("\n enter employee id:");
int empid=sc.nextInt();
System.out.println("\n enter employee name:");
String name=sc.next();
System.out.println("\n enter employee salary:");
double salary=sc.nextDouble();
System.out.println("\n enter employee address:");
String address=sc.next();
 System.out.println("Enter Department:");
 String dept = sc.next();
System.out.println("\n enter subject:");
String subject=sc.next();
arr[i]=new teacher(empid,name,salary,address,dept,subject);
}
System.out.println("\n information of all the employee");
for(int i=0;i<num;i++)
{
arr[i].display();
}
sc1.close();
}
}

output

enter the no of employees:
2

 enter employee id:
101

 enter employee name:
vishnu

 enter employee salary:
56000

 enter employee address:
niraphel
Enter Department:
maths

 enter subject:
discretemaths

 enter employee id:
102

 enter employee name:
priya

 enter employee salary:
75000

 enter employee address:
kanimangalam
Enter Department:
science

 enter subject:
biology

 information of all the employee
employee id:101
employee name:vishnu
employee salary:56000.0
employee address:niraphel
department:maths
subject:discretemaths
employee id:102
employee name:priya
employee salary:75000.0
employee address:kanimangalam
department:science
subject:biology








